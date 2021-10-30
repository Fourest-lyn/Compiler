package FrontEnd;

import AST.ASTVisitor;
import AST.DefineNode.*;
import AST.ExprNode.*;
import AST.ProgramNode;
import AST.StmtNode.*;
import AST.ToolNode.*;
import AST.TypeNode.ArrayType;
import AST.TypeNode.BaseType;
import AST.TypeNode.VoidType;
import Util.Error.SemanticError;
import Util.Position;
import Util.Scope.GlobalScope;
import Util.Scope.Scope;

public class SemanticChecker implements ASTVisitor
{
    private Scope currentScope;
    public GlobalScope globalScope;

    /** Program */
    @Override public void visit(ProgramNode node)
    {
        //todo
    }

    /** Statements */
    @Override public void visit(IfStatement stmt)
    {
        stmt.flag.accept(this);
        if(!stmt.flag.type.typeName().equals("bool"))
            throw new SemanticError(stmt.flag.pos,"Expect type <bool> but  <"+stmt.flag.type.typeName()+">.");

        if(stmt.trueStmt!=null)
        {
            currentScope=new Scope(currentScope);
            stmt.trueStmt.accept(this);
            currentScope=currentScope.parentScope();
        }
        else throw new SemanticError(stmt.pos,"Expect statements when condition is true.");

        if(stmt.falseStmt!=null)
        {
            currentScope=new Scope(currentScope);
            stmt.falseStmt.accept(this);
            currentScope=currentScope.parentScope();
        }
    }

    @Override public void visit(ReturnStatement stmt)
    {
        if(!currentScope.functionFlag)
            throw new SemanticError(stmt.pos,"Unexpected appearance of <return>.");

        if(stmt.expr!=null)
        {
            stmt.expr.accept(this);
            if(!stmt.expr.nullFlag)
            {
                if(!stmt.expr.type.typeName().equals(currentScope.functionType.typeName()))
                    throw new SemanticError(stmt.pos,"Unmatched return type.");
                //todo: to check the array dimension.
            }
        }
        else
        {
            if(currentScope.functionType!=null && !currentScope.functionType.typeName().equals("void"))
                throw new SemanticError(stmt.pos,"Expect return value.");
        }
    }

    @Override public void visit(BreakStatement stmt)
    {
        if(currentScope.loopStage==0)
            throw new SemanticError(stmt.pos,"Unexpected break.");
    }

    @Override public void visit(ContinueStatement stmt)
    {
        if(currentScope.loopStage==0)
            throw new SemanticError(stmt.pos,"Unexpected continue.");
    }

    @Override public void visit(WhileStatement stmt)
    {
        stmt.condition.accept(this);
        if(!stmt.condition.type.typeName().equals("bool"))
            throw new SemanticError(stmt.condition.pos,"Expect type <bool> but  <"+stmt.condition.type.typeName()+">.");

        if(stmt.stmt!=null)
        {
            currentScope=new Scope(currentScope);
            currentScope.loopStage++;
            stmt.stmt.accept(this);
            currentScope=currentScope.parentScope();
        }
    }

    @Override public void visit(ForStatement stmt)
    {
        if(stmt.init!=null) stmt.init.accept(this);
        if(stmt.condition!=null) stmt.condition.accept(this);
        if(stmt.incr!=null) stmt.incr.accept(this);
        if(stmt.stmt!=null)
        {
            currentScope=new Scope(currentScope);
            currentScope.loopStage++;
            stmt.stmt.accept(this);
            currentScope=currentScope.parentScope();
        }
    }

    @Override public void visit(ExprStatement stmt) {stmt.expr.accept(this);}

    @Override public void visit(BlockStatement stmt)
    {
        if(!stmt.stmts.isEmpty())
        {
            currentScope=new Scope(currentScope);
            for(var it: stmt.stmts) it.accept(this);
            currentScope=currentScope.parentScope();
        }
    }

    @Override public void visit(EmptyStatement stmt) {}

    /** Expression */
    @Override public void visit(BinaryExpression expr)
    {
        expr.leftExpr.accept(this);
        expr.rightExpr.accept(this);
        String leftType=expr.leftExpr.type.typeName();
        String rightType=expr.rightExpr.type.typeName();

        switch (expr.op)
        {
            case MUL,DIV,MOD,SUB,SHL,SHR,AND,OR,XOR ->
            {
                if(!leftType.equals("int"))
                    throw new SemanticError(expr.leftExpr.pos,"Expect value type <int> but <"+leftType+">.");
                if(!rightType.equals("int"))
                    throw new SemanticError(expr.rightExpr.pos,"Expect value type <int> but <"+rightType+">.");
                expr.type=new BaseType(expr.pos,"int");
            }
            case ADD,GRE,GEQ,LES,LEQ ->
            {
                if(!leftType.equals("int") && !leftType.equals("string"))
                    throw new SemanticError(expr.leftExpr.pos,"Expect value type <int> or <string> but <"+leftType+">.");
                if(!rightType.equals("int") && !rightType.equals("string"))
                    throw new SemanticError(expr.rightExpr.pos,"Expect value type <int> or <string> but <"+rightType+">.");
                if(!leftType.equals(rightType))
                    throw new SemanticError(expr.pos,"Expect same value type on both side.");
                if(expr.op.equals(BinaryExpression.Operator.ADD)) expr.type=new BaseType(expr.pos,leftType);
                else expr.type=new BaseType(expr.pos,"bool");
            }
            case EQ,NEQ ->
            {
                if(!leftType.equals(rightType) && !leftType.equals("null") && !rightType.equals("null"))
                    throw new SemanticError(expr.pos,"Expect same value type on both side.");
                expr.type=new BaseType(expr.pos,"bool");
            }
            case LOR,LAND ->
            {
                if(!leftType.equals("bool"))
                    throw new SemanticError(expr.leftExpr.pos,"Expect value type <bool> but <"+leftType+">.");
                if(!rightType.equals("bool"))
                    throw new SemanticError(expr.rightExpr.pos,"Expect value type <bool> but <"+rightType+">.");
                expr.type=new BaseType(expr.pos,"bool");
            }
        }
    }

    @Override public void visit(AssignExpression expr)
    {
        //todo
    }

    @Override public void visit(NewExpression expr)
    {
        //todo
    }

    @Override public void visit(ConstExpression expr)
    {
        //todo:
    }

    @Override public void visit(IdExpression expr)
    {
        //todo
    }

    @Override public void visit(ClassExpression expr)
    {
        //todo
    }

    @Override public void visit(IndexExpression expr)
    {
        //todo
    }

    @Override public void visit(FuncExpression expr)
    {
        //todo
    }

    @Override public void visit(UnaryExpression expr)
    {
        //todo
    }

    @Override public void visit(LambdaExpression expr)
    {
        //todo
    }

    @Override public void visit(ThisExpression expr)
    {
        if(currentScope.classFlag && currentScope.functionFlag)
        {
            expr.leftFlag=true;
            expr.type=currentScope.classType;
        }
        else throw new SemanticError(expr.pos,"Unexpected appearance of <this>.");
    }

    /** Define */
    @Override public void visit(ValueDefine def)
    {
        //todo
    }

    @Override public void visit(FunctionDefine def)
    {
        //todo
    }

    @Override public void visit(ClassDefine def)
    {
        //todo
    }

    @Override public void visit(ConstructDefine def)
    {
        //todo
    }

    @Override public void visit(SingleDefine def)
    {
        //todo
    }

    /** Type */
    @Override public void visit(BaseType type)
    {
        //todo
    }

    @Override public void visit(ArrayType type)
    {
        //todo
    }

    @Override public void visit(VoidType type) {}

    /** Tool */
    @Override public void visit(ValueList tool)
    {
        //todo
    }

    @Override public void visit(ObjectInitial tool)
    {
        //todo
    }

    @Override public void visit(FunctionParameter tool)
    {
        //todo
    }

    @Override public void visit(LambdaFunction tool)
    {
        //todo
    }

    @Override public void visit(ArrayInitial tool)
    {
        //todo
    }

    @Override public void visit(WrongInitial tool) {}
}

































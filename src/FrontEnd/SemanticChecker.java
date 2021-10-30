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
        //todo
    }

    @Override public void visit(ReturnStatement stmt)
    {
        //todo
    }

    @Override public void visit(BreakStatement stmt)
    {
        //todo
    }

    @Override public void visit(ContinueStatement stmt)
    {
        //todo
    }

    @Override public void visit(WhileStatement stmt)
    {
        //todo
    }

    @Override public void visit(ForStatement stmt)
    {
        //todo
    }

    @Override public void visit(ExprStatement stmt)
    {
        //todo
    }

    @Override public void visit(BlockStatement stmt)
    {
        //todo
    }

    @Override public void visit(EmptyStatement stmt)
    {
        //todo
    }

    /** Expression */
    @Override public void visit(BinaryExpression expr)
    {
        //todo
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
        //todo
    }

    @Override public void visit(IdExpression expr)
    {
        //todo
    }

    @Override public void visit(IncrExpression expr)
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
        //todo
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

    @Override public void visit(VoidType type)
    {
        //todo
    }

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

    @Override public void visit(WrongInitial tool)
    {
        //todo
    }
}

































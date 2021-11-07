package FrontEnd;

import AST.ASTVisitor;
import AST.DefineNode.*;
import AST.ExprNode.*;
import AST.ProgramNode;
import AST.StmtNode.*;
import AST.ToolNode.*;
import AST.TypeNode.ArrayType;
import AST.TypeNode.BaseType;
import AST.TypeNode.Type;
import AST.TypeNode.VoidType;
import Util.Debug;
import Util.Error.SemanticError;
import Util.Position;
import Util.Scope.GlobalScope;
import Util.Scope.Scope;

import java.util.Objects;

public class SemanticChecker implements ASTVisitor
{
    private Scope currentScope;
    public GlobalScope globalScope;
    private Debug debug;

    public SemanticChecker(GlobalScope globalScope)
    {
        this.globalScope=globalScope;
        currentScope=globalScope;
        debug=new Debug();
    }


    /** Program */
    @Override public void visit(ProgramNode node)
    {
        boolean mainFlag=false;
        int mainNum=-1;
        for(int i=0;i<node.defines.size();++i)
        {
            var it=node.defines.get(i);
            if(it instanceof FunctionDefine)
                if(((FunctionDefine) it).funcName.equals("main"))
                {
                    if(((FunctionDefine) it).returnType.typeName().equals("int"))
                    {
                        mainFlag = true;
                        mainNum = i;
                    }
                    if(((FunctionDefine) it).paras!=null)
                        throw new SemanticError(it.pos,"Main function should not have parameters");
                }

            it.accept(this);
        }
        if(!mainFlag) throw new SemanticError(node.pos,"Without function <int main()>");
        node.defines.get(mainNum).accept(this);
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
                    throw new SemanticError(stmt.pos,"Unmatched return type");
            }
            else
            {
                String tempName=currentScope.functionType.typeName();
                if((tempName.equals("int") || tempName.equals("bool")) && !(currentScope.functionType instanceof ArrayType))
                    throw new SemanticError(stmt.pos,"Null could not assign to <int> & <bool>.");
            }
            currentScope.returnType=stmt.expr.type;
        }
        else
        {
            if(currentScope.functionType!=null && !(currentScope.functionType instanceof VoidType))
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
            currentScope.parentScope().returnType=currentScope.returnType;
            currentScope=currentScope.parentScope();
        }

    }

    @Override public void visit(EmptyStatement stmt) {}

    @Override public void visit(ValueDefStatement stmt) {stmt.valueDefine.accept(this);}

    /** Expression */
    @Override public void visit(BinaryExpression expr)
    {
//        debug.module("BinaryExpression "+expr.pos.toString());
        expr.leftExpr.accept(this);
        expr.rightExpr.accept(this);
        String leftType=expr.leftExpr.type.typeName();
        String rightType=expr.rightExpr.type.typeName();

        switch (expr.op)
        {
            case MUL,DIV,MOD,SUB,SHL,SHR,AND,OR,XOR ->
            {
                if(!leftType.equals("int"))
                    throw new SemanticError(expr.leftExpr.pos,"Expect value type <int> but <"+leftType+">");
                if(!rightType.equals("int"))
                    throw new SemanticError(expr.rightExpr.pos,"Expect value type <int> but <"+rightType+">");
                expr.type=new BaseType(expr.pos,"int");
            }
            case ADD,GRE,GEQ,LES,LEQ ->
            {
                if(!leftType.equals("int") && !leftType.equals("string"))
                    throw new SemanticError(expr.leftExpr.pos,"Expect value type <int> or <string> but <"+leftType+">");
                if(!rightType.equals("int") && !rightType.equals("string"))
                    throw new SemanticError(expr.rightExpr.pos,"Expect value type <int> or <string> but <"+rightType+">");
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
                    throw new SemanticError(expr.leftExpr.pos,"Expect value type <bool> but <"+leftType+">");
                if(!rightType.equals("bool"))
                    throw new SemanticError(expr.rightExpr.pos,"Expect value type <bool> but <"+rightType+">");
                expr.type=new BaseType(expr.pos,"bool");
            }
        }
    }

    @Override public void visit(AssignExpression expr)
    {
        debug.module("AssignExpression");
        expr.leftExpr.accept(this);
        expr.rightExpr.accept(this);

        String leftType=expr.leftExpr.type.typeName();
        String rightType=expr.rightExpr.type.typeName();
        if(!expr.leftExpr.leftFlag)
            throw new SemanticError(expr.leftExpr.pos,"Except a lvalue but not");

        if(!leftType.equals(rightType))
        {
            if(rightType.equals("null"))
            {
                if((leftType.equals("int") || leftType.equals("bool")) && !(expr.leftExpr.type instanceof ArrayType))
                    throw new SemanticError(expr.rightExpr.pos,"The type <int> & <bool> should not be null.");

            }
            else throw new SemanticError(expr.pos,"Except same type on both side");
        }
        expr.type=expr.rightExpr.type;
    }

    @Override public void visit(NewExpression expr)
    {
        debug.module("NewExpression");
        expr.newType.accept(this);
        expr.type=expr.newType.type;
    }

    @Override public void visit(ConstExpression expr) {expr.type=new BaseType(expr.pos,expr.kind);}

    @Override public void visit(IdExpression expr)
    {
        if(!currentScope.checkVariable(expr.identifier,true))
            throw new SemanticError(expr.pos,"Undefined variable here");
        expr.type= currentScope.getVariable(expr.identifier,true);
    }

    @Override public void visit(ClassExpression expr)
    {
        expr.objectName.accept(this);
        Expression objectExpr=expr.objectName;
        String objectName;

//        if(objectExpr instanceof IdExpression) objectName=((IdExpression) objectExpr).identifier;
//        else if(objectExpr instanceof IndexExpression) objectName=((IndexExpression) objectExpr).objName;
//        else if(objectExpr instanceof ConstExpression && Objects.equals(((ConstExpression) objectExpr).kind, "string")) objectName=((ConstExpression) objectExpr).kind;// consider: how to save the value of constValue.
//        else if(objectExpr instanceof ThisExpression) objectName="this";
//        else if(objectExpr instanceof ClassExpression) objectName="";
//        else throw new SemanticError(expr.pos,"Unexpected expression type");

        // Check for ArrayType's size() method.
        if(objectExpr.type instanceof ArrayType && Objects.equals(expr.methodName,"size"))
        {
            if(expr.values!=null)
                throw new SemanticError(expr.values.pos,"Incorrect number of parameters");
            expr.type=new BaseType(expr.pos,"int");
            return;
        }

        Type objectType=objectExpr.type;
//        if(objectExpr instanceof ConstExpression)
//        {
//            objectType=new BaseType(objectExpr.pos,"string");
//        }
//        else if(objectExpr instanceof ThisExpression)
//        {
//            objectType=currentScope.classType;
//            if(currentScope.classType==null)
//                throw new SemanticError(expr.pos,"Unexpected appearance of <this>");
//        }
//        else if(objectExpr instanceof ClassExpression)
//        {
//            objectType=objectExpr.type;
//        }
//        else
//        {
//            if(!currentScope.checkVariable(objectName,true))
//                throw new SemanticError(expr.pos,"Undefined variable here");
//            objectType=currentScope.getVariable(objectName,true);
//        }

//        debug.print(objectType.typeName());
        if(objectType.typeName().equals("int") || objectType.typeName().equals("bool"))
            throw new SemanticError(objectExpr.pos,"Unexpected method call from type <int> or <bool>");
        if(objectType==null || objectType.typeName().equals("void") || objectType.typeName().equals("null"))
            throw new SemanticError(objectExpr.pos,"Unexpected expression type of <void> or <null>");

        if(!globalScope.checkType(objectType.typeName()))
            throw new SemanticError(expr.pos,"Undefined type here");// Just for insurance.
        ClassDefine classDefine=globalScope.getClass(objectType.typeName());

        String methodName=expr.methodName;
        if(expr.functionFlag)
        {
            if(!classDefine.classScope.containsFunction(methodName,false))
                throw new SemanticError(expr.pos,"Undefined method/function here");
            FunctionDefine function=classDefine.classScope.getFunction(methodName,false);
            if(expr.values==null && function.paras==null);
            else if(expr.values==null || function.paras==null)
                throw new SemanticError(expr.pos,"Incorrect number of parameters");
            else if(expr.values.expressions.size()!=function.paras.names.size())
                throw new SemanticError(expr.values.pos,"Incorrect number of parameters");
            if(expr.values!=null) expr.values.accept(this);
            expr.type=function.returnType;
        }
        else
        {
            if(!classDefine.classScope.checkVariable(methodName,false))
                throw new SemanticError(expr.pos,"Undefined variable here");
            expr.type= classDefine.classScope.getVariable(methodName,false);
            expr.leftFlag=true;
        }

    }

    @Override public void visit(IndexExpression expr)
    {
        debug.module("IndexExpression");
        expr.index.accept(this);
        if(!expr.index.type.typeName().equals("int"))
            throw new SemanticError(expr.index.pos,"Expect type <int> but <"+expr.index.type.typeName()+">");

        expr.name.accept(this);
        if(expr.name instanceof IndexExpression)
        {
            if(!(expr.name.type instanceof ArrayType))
                throw new SemanticError(expr.name.pos,"Unexpected expression type");
            Type exprType=((ArrayType) expr.name.type).baseType;
//            expr.maxDimension=((IndexExpression) expr.name).maxDimension;
            expr.type=exprType;
//            expr.objName=((IndexExpression) expr.name).objName;
        }
        else
        {
            Type tempType=expr.name.type;
            if(!(tempType instanceof ArrayType))
                throw new SemanticError(expr.pos,"Variable type error");
            expr.type=((ArrayType) tempType).baseType;
//            expr.maxDimension=((ArrayType) tempType).dimension;
        }
        expr.leftFlag=true;

//        if(expr.name instanceof IdExpression || expr.name instanceof ClassExpression)
//        {
//            expr.type=new ArrayType(expr.pos,new BaseType(expr.pos,expr.name.type.typeName()));
//            Type tempType=expr.name.type;

//            if (expr.name instanceof IdExpression)
//            {
//                expr.objName=((IdExpression) expr.name).identifier;
//                tempType=currentScope.getVariable(expr.objName, true);
//            }
//            tempType=expr.name.type;
//            if(!(tempType instanceof ArrayType))
//                throw new SemanticError(expr.pos,"Variable type error");
//            expr.type=((ArrayType) tempType).baseType;
//            expr.maxDimension=((ArrayType) tempType).dimension;
//        }
//        else
//        {
//            if(!(expr.name instanceof IndexExpression))
//                throw new SemanticError(expr.name.pos,"Unexpected expression type");
//            System.out.println(expr.name.type instanceof BaseType);
//            if(!(expr.name.type instanceof ArrayType))
//                throw new SemanticError(expr.name.pos,"Unexpected expression type");
//            Type exprType=((ArrayType) expr.name.type).baseType;
//            expr.maxDimension=((IndexExpression) expr.name).maxDimension;
//            expr.type=exprType;
//            expr.objName=((IndexExpression) expr.name).objName;
//
//        }
    }

    @Override public void visit(FuncExpression expr)
    {
        if(!currentScope.containsFunction(expr.funcName,true))
            throw new SemanticError(expr.pos,"Nonexistent function <"+expr.funcName+">");
        FunctionDefine function=currentScope.getFunction(expr.funcName,true);
        if(expr.values!=null)
        {
            if(function.paras==null)
                 throw new SemanticError(expr.pos,"Incorrect number of parameters");
            expr.values.accept(this);
            if(expr.values.expressions.size()!=function.paras.names.size())
                throw new SemanticError(expr.values.pos,"Incorrect number of parameters");
        }
        else
        {
            if(function.paras!=null)
                throw new SemanticError(expr.pos,"Incorrect number of parameters");
        }
        expr.type=function.returnType;
    }

    @Override public void visit(UnaryExpression expr)
    {
        expr.rightExpr.accept(this);
        String typeName=expr.rightExpr.type.typeName();
        Position pos=expr.rightExpr.pos;

        switch (expr.op)
        {
            case SELFDEC,SELFINC ->
            {
                if(!typeName.equals("int"))
                    throw new SemanticError(pos,"Except type <int> but <"+typeName+">.");
                if(!expr.rightExpr.leftFlag)
                    throw new SemanticError(pos,"Except lvalue here");
                expr.leftFlag=true;
                expr.type=new BaseType(pos,"int");
            }
            case NEG,POS,BITNOT ->
            {
                if(!typeName.equals("int"))
                    throw new SemanticError(pos,"Except type <int> but <"+typeName+">.");
                expr.type=new BaseType(pos,"int");
            }
            case LNOT ->
            {
                if(!typeName.equals("bool"))
                    throw new SemanticError(pos,"Except type <bool> but <"+typeName+">.");
                expr.type=new BaseType(pos,"bool");
            }
        }

    }

    @Override public void visit(LambdaExpression expr)
    {
        expr.lambda.accept(this);
        expr.type=expr.lambda.returnType;
    }

    @Override public void visit(ThisExpression expr)
    {
        if(currentScope.classFlag && currentScope.functionFlag)
            expr.type=currentScope.classType;
        else throw new SemanticError(expr.pos,"Unexpected appearance of <this>.");
    }

    @Override public void visit(IncrExpression expr)
    {
        expr.leftExpr.accept(this);
        if(!expr.leftExpr.type.typeName().equals("int"))
            throw new SemanticError(expr.leftExpr.pos,"Except type <int> but <"+expr.leftExpr.type.typeName()+">.");
        if(!expr.leftExpr.leftFlag)
            throw new SemanticError(expr.leftExpr.pos,"Except lvalue here");
        expr.type=new BaseType(expr.pos,"int");
    }

    /** Define */
    @Override public void visit(ValueDefine def)
    {
        def.type.accept(this);
        for(var it: def.valueDefs) it.accept(this);
    }

    @Override public void visit(FunctionDefine def)
    {
        def.returnType.accept(this);

//        if(globalScope.checkFuncName(def.funcName))
//            throw new SemanticError(def.pos,"Function name already exists");
//        debug.print("Visit here, funcName="+def.funcName);
//        currentScope.putFunction(def);

        if(def.paras!=null) def.paras.accept(this);

        currentScope=new Scope(currentScope);
        currentScope.functionType=def.returnType;
//        debug.print(def.returnType.typeName());
        currentScope.functionFlag=true;

        if(def.paras!=null) currentScope.putParameters(def.paras);
        def.suite.accept(this);
//        debug.print(currentScope.returnType.typeName());
        if(currentScope.returnType==null)
        {
            if(!(currentScope.functionType instanceof VoidType) && !Objects.equals(def.funcName, "main"))
                throw new SemanticError(def.pos,"Return type error");
        }
        else if(!Objects.equals(currentScope.returnType.typeName(), currentScope.functionType.typeName()))
            throw new SemanticError(def.pos,"Return type error");
//        def.functionScope=currentScope;
        currentScope=currentScope.parentScope();
//        currentScope.putFunction(def);
    }

    @Override public void visit(ClassDefine def)
    {
        debug.module("ClassDefine");
//        if(globalScope.checkType(def.className))
//            throw new SemanticError(def.pos,"Class name already exists.");
//        globalScope.addType(def.pos,def.className);
        if(globalScope.checkForClassName(def.className))
            throw new SemanticError(def.pos,"Unexpected class name");
        currentScope=def.classScope;
        currentScope.classType=new BaseType(def.pos,def.className);

        for(var it: def.valueDefs) it.accept(this);
        for(var it: def.funcDefs) it.accept(this);
        for(var it: def.consDefs) it.accept(this);

        currentScope=globalScope;
    }

    @Override public void visit(ConstructDefine def)
    {
        if(!currentScope.classFlag)
            throw new SemanticError(def.pos,"Constructor not in class.");
        if(!def.name.equals(currentScope.classType.typeName()))
            throw new SemanticError(def.pos,"Unexpected Constructor name.");

        currentScope=new Scope(currentScope);
        def.suite.accept(this);
        currentScope=currentScope.parentScope();
    }

    @Override public void visit(SingleDefine def)
    {
        if(!(currentScope.classFlag && !currentScope.functionFlag) && currentScope.checkVariable(def.name,false))
            throw new SemanticError(def.pos,"Variable name already exists");
        if(Objects.equals(currentScope,globalScope) && globalScope.checkType(def.name))
            throw new SemanticError(def.pos,"Variable name should not be same as a type");


        if(def.expr!=null)
        {
            def.expr.accept(this);
            String typeName=def.type.typeName();
            if(def.expr.nullFlag)
            {
                if((typeName.equals("int") || typeName.equals("bool")) && !(def.type instanceof ArrayType))
                    throw new SemanticError(def.expr.pos,"Null could not assign to <int> & <bool>");
            }
            else
            {
                if(def.expr.type.typeName().equals("null"))
                {
                    System.out.println(def.type instanceof ArrayType);
                    if((typeName.equals("int") || typeName.equals("bool")) && !(def.type instanceof ArrayType))
                        throw new SemanticError(def.expr.pos,"Null could not assign to <int> & <bool>");
                }
                else if(!def.type.typeName().equals(def.expr.type.typeName()))
                    throw new SemanticError(def.expr.pos,"Incorrect Type of expression");
            }
        }
        currentScope.putVariable(def.type,def.name);
    }

    /** Type */
    @Override public void visit(BaseType type)
    {
        if(!globalScope.checkType(type.typeName()))
            throw new SemanticError(type.pos,"Undefined type used");
    }

    @Override public void visit(ArrayType type) {debug.module("ArrayType");type.baseType.accept(this);}

    @Override public void visit(VoidType type) {}

    /** Tool */
    @Override public void visit(ValueList tool)
    {
        for(var it: tool.expressions)
            it.accept(this);
    }

    @Override public void visit(ObjectInitial tool) {tool.type.accept(this);}

    @Override public void visit(FunctionParameter tool)
    {
        if(tool.names!=null || tool.types!=null)
        {
            if(tool.types==null || tool.names==null)
                throw new SemanticError(tool.pos, "Expect same number of identifier and type.");
            if(tool.types.size()!=tool.names.size())
                throw new SemanticError(tool.pos,"Expect same number of identifier and type.");
            for(var it: tool.types) it.accept(this);
        }
    }

    @Override public void visit(LambdaFunction tool)
    {
        if(tool.valuelist==null && tool.paras==null)
        {
            currentScope=new Scope(currentScope);
            currentScope.functionFlag=true;
            tool.suite.accept(this);
            currentScope=currentScope.parentScope();
            return;
        }

        if(tool.valuelist==null || tool.paras==null)
            throw new SemanticError(tool.pos,"Incorrect number of parameters.");
        tool.valuelist.accept(this);
        tool.paras.accept(this);

        if(tool.valuelist.expressions.size()!=tool.paras.names.size())
            throw new SemanticError(tool.valuelist.pos,"Incorrect number of parameters.");
        currentScope=new Scope(currentScope);
        currentScope.returnType = null;
        currentScope.putParameters(tool.paras);
        currentScope.functionFlag=true;
        tool.suite.accept(this);
        if(currentScope.returnType==null) tool.returnType=new VoidType(tool.pos);
        else tool.returnType=currentScope.returnType;
//            throw new SemanticError(tool.pos,"Expect a return statement");
        currentScope=currentScope.parentScope();
    }

    @Override public void visit(ArrayInitial tool)
    {
        debug.module("ArrayInitial");

        tool.baseType.accept(this);
        for(var it: tool.expressions)
        {
            it.accept(this);
            if(!it.type.typeName().equals("int"))
                throw new SemanticError(it.pos,"Expect type <int> but <"+it.type.typeName()+">.");
        }
        Type type=new BaseType(tool.pos,tool.baseType.typeName());
        for(int i=0;i<tool.dimension;++i) type=new ArrayType(tool.pos,type);

        tool.type=type;

    }

    @Override public void visit(WrongInitial tool) {}
}

































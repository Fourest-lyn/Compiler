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
import Util.Debug;
import Util.Error.SemanticError;
import Util.Scope.GlobalScope;
import Util.Scope.Scope;

public class SymbolCollector implements ASTVisitor
{
    private Scope currentScope;
    public GlobalScope globalScope;
    Debug debug=new Debug();

    public SymbolCollector(GlobalScope globalScope)
    {
        this.globalScope=globalScope;
        currentScope=globalScope;
        debug=new Debug();
    }

    @Override public void visit(ProgramNode node)
    {
        for(var it: node.defines)
        {
            if(!(it instanceof ValueDefine))
                it.accept(this);
        }
    }

    @Override public void visit(IfStatement stmt){}
    @Override public void visit(ReturnStatement stmt){}
    @Override public void visit(BreakStatement stmt){}
    @Override public void visit(ContinueStatement stmt){}
    @Override public void visit(WhileStatement stmt){}
    @Override public void visit(ForStatement stmt){}
    @Override public void visit(ExprStatement stmt){}
    @Override public void visit(BlockStatement stmt){}
    @Override public void visit(EmptyStatement stmt){}
    @Override public void visit(ValueDefStatement stmt){}

    @Override public void visit(BinaryExpression expr){}
    @Override public void visit(AssignExpression expr){}
    @Override public void visit(NewExpression expr){}
    @Override public void visit(ConstExpression expr){}
    @Override public void visit(IdExpression expr){}
    @Override public void visit(ClassExpression expr){}
    @Override public void visit(IndexExpression expr){}
    @Override public void visit(FuncExpression expr){}
    @Override public void visit(UnaryExpression expr){}
    @Override public void visit(LambdaExpression expr){}
    @Override public void visit(ThisExpression expr){}
    @Override public void visit(IncrExpression expr){}

    @Override public void visit(ValueDefine def) {for(var it: def.valueDefs) it.accept(this);}
    @Override public void visit(FunctionDefine def)
    {
        if(currentScope.containsFunction(def.funcName,false))
            throw new SemanticError(def.pos,"Existed function");
        currentScope.putFunction(def);
    }
    @Override public void visit(ClassDefine def)
    {
        if(globalScope.checkType(def.className))
            throw new SemanticError(def.pos,"Existed class");
        currentScope=new Scope(currentScope);
        currentScope.classFlag=true;

        for(var it: def.valueDefs)  it.accept(this);
        for(var it: def.funcDefs)   it.accept(this);

        def.classScope=currentScope;
        currentScope=currentScope.parentScope();

        globalScope.addClass(def);
    }
    @Override public void visit(ConstructDefine def){}
    @Override public void visit(SingleDefine def)
    {
        if(currentScope.checkVariable(def.name,false))
            throw new SemanticError(def.pos,"Existed variable");
        currentScope.putVariable(def.type,def.name);
    }

    @Override public void visit(BaseType type) {}
    @Override public void visit(ArrayType type) {}
    @Override public void visit(VoidType type) {}

    @Override public void visit(ValueList tool){}
    @Override public void visit(ObjectInitial tool){}
    @Override public void visit(FunctionParameter tool){}
    @Override public void visit(LambdaFunction tool){}
    @Override public void visit(ArrayInitial tool){}
    @Override public void visit(WrongInitial tool){}

}

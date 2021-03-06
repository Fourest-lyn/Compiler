package AST.DefineNode;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.StmtNode.BlockStatement;
import AST.ToolNode.FunctionParameter;
import AST.TypeNode.Type;
import Util.Position;
import Util.Scope.Scope;

public class FunctionDefine extends Define
{
    public Type returnType;
    public String funcName;
    public FunctionParameter paras;
    public BlockStatement suite;
    public Scope functionScope;


    public FunctionDefine(Position pos,Type returnType,String funcName,FunctionParameter paras,BlockStatement suite)
    {
        super(pos);
        this.returnType=returnType;
        this.funcName=funcName;
        this.paras=paras;
        this.suite=suite;
    }

    public FunctionDefine(Position pos,Type returnType,String funcName)
    {
        super(pos);
        this.returnType=returnType;
        this.funcName=funcName;
        this.paras=new FunctionParameter(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

package AST.ToolNode;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.StmtNode.BlockStatement;
import AST.StmtNode.Statement;
import AST.TypeNode.Type;
import Util.Position;

public class LambdaFunction extends ASTNode
{
    public FunctionParameter paras;
    public BlockStatement suite;
    public ValueList valuelist;
    public Type returnType;

    public LambdaFunction(Position pos,FunctionParameter paras,BlockStatement suite,ValueList valuelist)
    {
        super(pos);
        this.paras=paras;
        this.suite=suite;
        this.valuelist=valuelist;
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

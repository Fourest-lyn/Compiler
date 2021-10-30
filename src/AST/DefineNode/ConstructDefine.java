package AST.DefineNode;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.StmtNode.BlockStatement;
import Util.Position;

public class ConstructDefine extends Define
{
    public String name;
    public BlockStatement suite;


    public ConstructDefine(Position pos,String name,BlockStatement suite)
    {
        super(pos);
        this.name=name;
        this.suite=suite;
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

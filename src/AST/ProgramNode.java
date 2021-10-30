package AST;

import AST.DefineNode.Define;
import Util.Position;

import java.util.ArrayList;

public class ProgramNode extends ASTNode
{
    public ArrayList<ASTNode> defines;

    public ProgramNode(Position pos,ArrayList<ASTNode> defines)
    {
        super(pos);
        this.defines=defines;
    }
    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

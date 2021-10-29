package AST;

import Util.Position;

import java.util.ArrayList;

public class RootNode extends ASTNode
{
    ArrayList<ASTNode> blocks;
    public RootNode(Position pos)
    {
        super(pos);
        blocks=new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }

}

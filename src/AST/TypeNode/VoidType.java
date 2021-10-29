package AST.TypeNode;

import AST.ASTVisitor;
import Util.Position;

public class VoidType extends Type
{
    //todo: change the typename
    public VoidType(Position pos,String typeName)
    {
        super(pos,typeName);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

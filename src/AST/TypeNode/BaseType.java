package AST.TypeNode;

import AST.ASTVisitor;
import Util.Position;

public class BaseType extends Type
{
    public BaseType(Position pos,String typeName)
    {
        super(pos,typeName);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

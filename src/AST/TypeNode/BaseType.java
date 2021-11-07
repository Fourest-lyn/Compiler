package AST.TypeNode;

import AST.ASTVisitor;
import Util.Position;

import java.util.Objects;

public class BaseType extends Type
{
    public BaseType(Position pos,String typeName) {super(pos,typeName);}

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}

    @Override public boolean equals(Object obj)
    {
        if(!(obj instanceof BaseType)) return false;
        return Objects.equals(((BaseType) obj).typeName(),this.typeName());
    }
}

package AST.TypeNode;

import AST.ASTVisitor;
import Util.Position;

public class ArrayType extends Type
{
    public int dimension;
    public Type baseType;

    public ArrayType(Position pos, Type type)
    {
        super(pos, type.typeName());
        if(type instanceof ArrayType)
        {
            this.baseType=type;
            this.dimension=((ArrayType) type).dimension+1;
        }
        else
        {
            this.baseType=type;
            this.dimension=1;
        }
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
    @Override public boolean equals(Object obj)
    {
        if(!(obj instanceof ArrayType)) return false;
        return this.baseType.equals(((ArrayType) obj).baseType);
    }
}

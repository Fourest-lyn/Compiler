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
            this.baseType=((ArrayType) type).baseType;
            this.dimension=((ArrayType) type).dimension+1;
        }
        else
        {
            this.baseType=type;
            this.dimension=1;
        }
    }

    public ArrayType(Position pos,BaseType baseType,int dimension)
    {
        super(pos, baseType.typeName());
        this.baseType=baseType;
        this.dimension=dimension;
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

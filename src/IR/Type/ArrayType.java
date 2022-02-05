package IR.Type;

import IR.Operand.IROperand;

public class ArrayType extends PointerType
{
    private int length;

    public ArrayType(IRType baseType,int length)
    {
        super(baseType);
        this.length=length;
    }

    @Override
    public int size()
    {
        return baseType.size()*length;
    }

    @Override
    public String toString()
    {
        return "["+length+" x "+baseType.toString()+"]";
    }

    @Override public IROperand getValue() {return null;}
}

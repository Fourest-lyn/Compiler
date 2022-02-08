package IR.Type;

import IR.Operand.IROperand;
import IR.Operand.NullPointerConst;

public class PointerType extends IRType
{
    public IRType baseType;

    public PointerType(IRType baseType)
    {
        this.baseType=baseType;
    }

    @Override
    public int size()
    {
        return 4; //32 bits
    }

    @Override
    public String toString()
    {
        return baseType.toString()+"*";
    }

    @Override
    public IROperand getValue()
    {
        return new NullPointerConst();
    }
}

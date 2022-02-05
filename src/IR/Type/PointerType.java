package IR.Type;

import IR.Operand.IROperand;
import IR.Operand.NullPointerConst;

public class PointerType extends IRType
{
    IRType baseType;

    public PointerType(IRType baseType)
    {
        this.baseType=baseType;
    }

    @Override
    public int size()
    {
        return 4; //consider: may need fix
    }

    @Override
    public String toString()
    {
        return baseType.toString()+"*";
    }

    @Override
    public IROperand getValue()
    {
        //consider: may need fix
        return new NullPointerConst();
    }
}

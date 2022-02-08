package IR.Operand;

import IR.Type.IntegerType;

public class IntConst extends IROperand
{
    private int value;
    public IntConst(int value)
    {
        super(new IntegerType(32),"int_const");
        this.value=value;
    }

    public IntConst(int value,int width)
    {
        super(new IntegerType(width),"int_const");
        this.value=value;
    }

    @Override
    public String name()
    {
        return Integer.toString(value);
    }
}

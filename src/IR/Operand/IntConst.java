package IR.Operand;

import IR.Type.IntegerType;

public class IntConst extends IROperand
{
    private int value;
    public IntConst(int value)
    {
        super(new IntegerType(32));
        this.value=value;
    }

    public IntConst(int value,int width)
    {
        super(new IntegerType(width));
        this.value=value;
    }

    @Override
    public String toString()
    {
        return Integer.toString(value);
    }
}

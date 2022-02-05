package IR.Operand;

import IR.Type.IntegerType;

public class BoolConst extends IROperand
{
    private boolean value;
    public BoolConst(boolean value)
    {
        super(new IntegerType(1));
        this.value=value;
    }

    @Override
    public String toString()
    {
        return value ? "true" : "false";
    }
}

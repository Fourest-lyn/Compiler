package IR.Operand;

import IR.Type.IntegerType;

public class BoolConst extends IROperand
{
    private boolean value;

    public BoolConst(boolean value)
    {
        //consider: a better name for const?
        super(new IntegerType(1),"bool_const");
        this.value=value;
    }

    @Override
    public String name()
    {
        return value ? "true" : "false";
    }
}

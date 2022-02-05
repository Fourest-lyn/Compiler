package IR.Type;

import IR.Operand.BoolConst;
import IR.Operand.IROperand;
import IR.Operand.IntConst;

public class IntegerType extends IRType
{
    //In most situation width will be 1, 8 or 32.
    private int width;
    public IntegerType(){width=32;}
    public IntegerType(int width){this.width=width;}

    @Override
    public int size()
    {
        return width/8+((width%8==0)?0:1);
    }

    @Override
    public IROperand getValue()
    {
        if(width==1) return new BoolConst(false);
        return new IntConst(0);
    }

    @Override
    public String toString()
    {
        return "i"+width;
    }
}

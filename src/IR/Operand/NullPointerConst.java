package IR.Operand;

import IR.Type.PointerType;
import IR.Type.VoidType;

public class NullPointerConst extends IROperand
{
    public NullPointerConst()
    {
        super(new PointerType(new VoidType()));
    }

    @Override public String toString() {return "null";}
}

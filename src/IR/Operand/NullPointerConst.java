package IR.Operand;

import IR.Type.PointerType;
import IR.Type.VoidType;

public class NullPointerConst extends IROperand
{
    public NullPointerConst()
    {
        super(new PointerType(new VoidType()),"nullptr");
    }

    @Override public String name() {return "null";}
}

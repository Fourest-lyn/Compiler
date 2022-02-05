package IR.Instruction;

import IR.IRVisitor;

public class BrInstr  extends IRInstruction
{
    @Override
    public String toString()
    {
        return "";
    }

    @Override public void accept(IRVisitor visitor) {visitor.visit(this);}
}

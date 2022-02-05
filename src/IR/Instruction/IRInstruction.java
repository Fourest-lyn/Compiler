package IR.Instruction;

import IR.IRVisitor;

abstract public class IRInstruction
{
    abstract public String toString();
    abstract public void accept(IRVisitor visitor);
}

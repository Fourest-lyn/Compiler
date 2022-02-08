package IR.Instruction;

import IR.Base.User;
import IR.Block.BasicBlock;
import IR.Constructor.IRVisitor;
import IR.Type.IRType;

abstract public class IRInstruction extends User
{
    public BasicBlock parentBlock;

    public IRInstruction(IRType type,String name,BasicBlock parentBlock)
    {
        super(type,name);
        this.parentBlock=parentBlock;
    }

    abstract public String toString();
    abstract public void accept(IRVisitor visitor);
}

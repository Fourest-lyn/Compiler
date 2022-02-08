package IR.Block;

import IR.Base.Value;
import IR.Constructor.IRVisitor;
import IR.Instruction.IRInstruction;

import java.util.LinkedList;

public class BasicBlock extends Value
{
    //todo:
    //  label
    //consider: ArrayList?
    public LinkedList<IRInstruction> instructions;

    public BasicBlock()
    {
        instructions=new LinkedList<>();
    }

    public void addInstr(IRInstruction instr)
    {
        instructions.addLast(instr);
    }

    public void accept(IRVisitor visitor){visitor.visit(this);}
}

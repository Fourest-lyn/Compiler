package IR;

import IR.Instruction.IRInstruction;

import java.util.LinkedList;

public class BasicBlock
{
    //todo:
    //  label
    //consider: ArrayList?
    public LinkedList<IRInstruction> instructions;

    public BasicBlock()
    {

    }

    public void accept(IRVisitor visitor){visitor.visit(this);}
}

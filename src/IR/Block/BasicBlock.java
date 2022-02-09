package IR.Block;

import IR.Base.Value;
import IR.Constructor.IRVisitor;
import IR.Instruction.IRInstruction;
import IR.Type.LabelType;

import java.util.LinkedList;

public class BasicBlock extends Value
{
    public boolean endFlag=false;
    public Function parentFunction;
    public LinkedList<IRInstruction> instructions=new LinkedList<>();

    public BasicBlock(String label,Function parentFunction)
    {
        super(new LabelType(),label);
        this.parentFunction=parentFunction;
        parentFunction.addBlock(this);
    }

    public boolean haveEnd() {return endFlag;}

    public void push_front(IRInstruction instr)
    {
        instructions.addFirst(instr);
    }

    public void push_back(IRInstruction instr)
    {
        instructions.addLast(instr);
    }

    public void accept(IRVisitor visitor) {visitor.visit(this);}
}

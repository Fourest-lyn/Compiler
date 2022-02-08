package IR.Instruction;

import IR.Base.Value;
import IR.Block.BasicBlock;
import IR.Constructor.IRVisitor;
import IR.Type.VoidType;

public class BrInstr extends IRInstruction
{
    private boolean isJump;

    public BrInstr(Value condition,BasicBlock ifTure,BasicBlock ifFalse,BasicBlock parentBlock)
    {
        super(new VoidType(),"br",parentBlock);
        this.addOperand(condition);
        this.addOperand(ifTure);
        this.addOperand(ifFalse);
        isJump=false;
    }

    public BrInstr(BasicBlock dest,BasicBlock parentBlock)
    {
        super(new VoidType(),"br",parentBlock);
        this.addOperand(dest);
        isJump=true;
    }

    public boolean jumpMod() {return isJump;}

    private Value condition() {return this.getOperand(0);}
    private BasicBlock ifTure() {return (BasicBlock) this.getOperand(1);}
    private BasicBlock ifFalse() {return (BasicBlock) this.getOperand(2);}
    private BasicBlock dest() {return (BasicBlock) this.getOperand(0);}

    @Override
    public String toString()
    {
        // br i1 <cond>, label <ifTrue>, label <ifFalse>
        // br label <dest>
        if(jumpMod()) return "br "+dest().print();
        return "br "+condition().print()+", "+ifTure().print()+", "+ifFalse().print();
    }

    @Override public void accept(IRVisitor visitor) {visitor.visit(this);}
}

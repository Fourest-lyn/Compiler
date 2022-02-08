package IR.Instruction;

import IR.Base.Value;
import IR.Block.BasicBlock;
import IR.Constructor.IRVisitor;

public class StoreInstr extends IRInstruction
{
    public StoreInstr(Value storePointer,Value storeValue, BasicBlock parentBlock)
    {
        super(storeValue.type,"store",parentBlock);
        this.addOperand(storePointer);
        this.addOperand(storeValue);
    }

    private Value storePointer() {return this.getOperand(0);}
    private Value storeValue() {return this.getOperand(1);}

    @Override
    public String toString()
    {
        //store i32 9, i32* %ptr, align 4
        return "store "+storeValue().print()+", "+storePointer().print()
                +", align "+storeValue().type.size();
    }

    @Override public void accept(IRVisitor visitor) {visitor.visit(this);}
}

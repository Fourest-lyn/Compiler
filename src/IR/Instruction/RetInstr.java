package IR.Instruction;

import IR.Base.Value;
import IR.Block.BasicBlock;
import IR.Constructor.IRVisitor;
import IR.Type.VoidType;

public class RetInstr extends IRInstruction
{
    public RetInstr(Value retValue, BasicBlock parentBlock)
    {
        super(retValue.type,"ret",parentBlock);
        this.addOperand(retValue);
    }

    private Value retValue() {return this.getOperand(0);}

    @Override
    public String toString()
    {
        // ret void || ret i32 0
        if(retValue().type instanceof VoidType) return "ret void";
        return "ret "+type.toString()+" "+retValue().name();
    }

    @Override public void accept(IRVisitor visitor) {visitor.visit(this);}
}

package IR.Instruction;

import IR.Base.Value;
import IR.Block.BasicBlock;
import IR.Constructor.IRVisitor;
import IR.Type.PointerType;

public class LoadInstr extends IRInstruction
{
    public LoadInstr(String name,Value loadPointer,BasicBlock parentBlock)
    {
        //Save the baseType into this class, add pointer type into operands
        super(((PointerType)loadPointer.type).baseType,name,parentBlock);
        this.addOperand(loadPointer);
    }

    private Value loadPointer() {return this.getOperand(0);}

    @Override
    public String toString()
    {
        // %dest = load i32, i32* %ptr, align 4
        return name()+" = load "+type.toString()+", "
                +loadPointer().print()+", align "+type.size();
    }

    @Override public void accept(IRVisitor visitor) {visitor.visit(this);}
}

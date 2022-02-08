package IR.Instruction;

import IR.Block.BasicBlock;
import IR.Constructor.IRVisitor;
import IR.Type.IRType;
import IR.Type.PointerType;

public class AllocaInstr extends IRInstruction
{
    private IRType baseType;

    public AllocaInstr(String name, IRType baseType, BasicBlock parentBlock)
    {
        //consider: whether the name is correct
        super(new PointerType(baseType),name,parentBlock);
        this.baseType=baseType;
    }

    @Override
    public String toString()
    {
        //%ptr = alloca i32, align 1024
        return this.name()+" = alloca "+baseType.toString()+", align "+baseType.size();
    }

    @Override public void accept(IRVisitor visitor) {visitor.visit(this);}
}

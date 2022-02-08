package IR.Constructor;

import IR.Block.BasicBlock;
import IR.Block.Function;
import IR.Block.Module;
import IR.Instruction.*;

public interface IRVisitor
{
    public void visit(BasicBlock obj);
    public void visit(Function obj);
    public void visit(Module obj);

    public void visit(AllocaInstr   instr);
    public void visit(BinaryInstr   instr);
    public void visit(BrInstr       instr);
    public void visit(CallInstr     instr);
    public void visit(LoadInstr     instr);
    public void visit(RetInstr      instr);
    public void visit(StoreInstr    instr);
}

package IR.Instruction;

import IR.Base.Value;
import IR.Block.BasicBlock;
import IR.Constructor.IRVisitor;
import IR.Type.IRType;
import IR.Type.PointerType;

import java.util.ArrayList;

public class GetElementPtrInstr extends IRInstruction
{
    public GetElementPtrInstr(IRType baseType, Value pointer, ArrayList<Value> indexes, BasicBlock parentBlock)
    {
        //consider: the meaning of name
        super(baseType,"getElementPtr",parentBlock);
        assert pointer.type instanceof PointerType;
        this.addOperand(pointer);
        for(var it:indexes) this.addOperand(it);
    }

    public Value pointer() {return this.getOperand(0);}
    //The pos is count from 1.
    public Value index(int pos) {return this.getOperand(pos);}
    private int indexNum() {return this.listSize()-1;}

    @Override
    public String toString()
    {
        // %arrayidx = getelementptr inbounds %struct.ST, %struct.ST* %s, i64 1, i32 2
        // %t4 = getelementptr inbounds [10 x [20 x i32]], [10 x [20 x i32]]* %t3, i32 0, i32 5
        StringBuilder output;
        output = new StringBuilder(this.name() + " = getelementptr inbounds " +
                ((PointerType) pointer().type).baseType.toString() + ", " + pointer().print());
        for(int i=1;i<=indexNum();++i) output.append(", ").append(index(i).print());
        return output.toString();
    }

    @Override public void accept(IRVisitor visitor) {visitor.visit(this);}
}

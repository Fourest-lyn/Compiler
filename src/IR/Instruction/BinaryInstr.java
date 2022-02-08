package IR.Instruction;

import IR.Base.Value;
import IR.Block.BasicBlock;
import IR.Constructor.IRVisitor;
import IR.Type.IRType;

public class BinaryInstr extends IRInstruction
{
    //The kinds of binary calculation:
    //  + - * / % >> << & | ^
    public enum BinaryType {add,sub,mul,srem,sdiv,shl,shr,and,or,xor};

    private BinaryType opType;

    public BinaryInstr(BinaryType opType, IRType resultType, Value leftValue, Value rightValue, BasicBlock parentBlock)
    {
        super(resultType,opType.toString(),parentBlock);
        this.opType=opType;
        this.addOperand(leftValue);
        this.addOperand(rightValue);
    }

    private Value leftValue() {return this.getOperand(0);}
    private Value rightValue() {return this.getOperand(1);}

    @Override
    public String toString()
    {
        // %result = add i32 %A, %B
        return this.name()+" = "+opType.toString()+" "+type.toString()+" "
                +leftValue().name()+", "+rightValue().name();
    }

    @Override public void accept(IRVisitor visitor) {visitor.visit(this);}
}

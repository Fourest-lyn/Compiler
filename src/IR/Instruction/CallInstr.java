package IR.Instruction;

import IR.Base.Value;
import IR.Block.BasicBlock;
import IR.Block.Function;
import IR.Constructor.IRVisitor;
import IR.Type.FunctionType;
import IR.Type.VoidType;

import java.util.ArrayList;

public class CallInstr extends IRInstruction
{
    public CallInstr(Function func, ArrayList<Value> args, BasicBlock parentBlock)
    {
        super(((FunctionType)func.type).returnType,"call",parentBlock);
        this.addOperand(func);
        for(var it:args) addOperand(it);
    }

    public Function func() {return (Function) this.getOperand(0);}
    //The function: getArg do not promise correct-ness
    //the index of getArg is 0 ~ argNum-1
    public Value getArg(int index) {return this.getOperand(index+1);}
    public boolean haveArg() {return (this.listSize()>1);}
    public int argNum() {return this.listSize()-1;}

    @Override
    public String toString()
    {
        // %ans = call i32 @funcName(i32 12, i8 %flag)
        //consider: what is no-alias
        StringBuilder output;
        if(func().type instanceof VoidType) output = new StringBuilder();
        else output = new StringBuilder(func().name() + " = ");
        output.append("call ").append(func().print()).append("(");
        if(haveArg())
        {
            for(int i=0;i<argNum()-1;++i) output.append(getArg(i).print()).append(", ");
            output.append(getArg(argNum()-1).print());
        }
        output.append(")");
        return output.toString();
    }

    @Override public void accept(IRVisitor visitor) {visitor.visit(this);}
}

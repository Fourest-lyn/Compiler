package IR.Block;

import IR.Base.Value;
import IR.Constructor.IRVisitor;
import IR.Operand.GlobalVariable;
import IR.Type.FunctionType;
import IR.Type.IRType;
import IR.Type.PointerType;
import IR.Type.VoidType;

import java.util.LinkedList;

public class Function extends GlobalVariable
{
    //The function type will store in this.type
    private LinkedList<BasicBlock> blocks=new LinkedList<>();
    //These two blocks are out of the list and must be existed.
    private BasicBlock entryBlock,exitBlock;
    private Value returnPointer=null;

    public boolean isBuiltin=false;

    public Function(String funcName, FunctionType funcType)
    {
        super(funcName,funcType);
        entryBlock=new BasicBlock("entry",this);
        exitBlock=new BasicBlock("exit",this);
    }

    public boolean isVoid() {return (type instanceof VoidType);}

    public void addBlock(BasicBlock block){blocks.addLast(block);}
    public BasicBlock entry() {return entryBlock;}
    public BasicBlock exit() {return exitBlock;}

    public Value getRetPtr() {return returnPointer;}
    public void setRetPtr(Value ptr)
    {
        assert ptr.type instanceof PointerType;
        returnPointer=ptr;
    }

    public void accept(IRVisitor visitor) {visitor.visit(this);}
}

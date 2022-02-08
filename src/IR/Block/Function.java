package IR.Block;

import IR.Constructor.IRVisitor;
import IR.Operand.GlobalVariable;
import IR.Type.FunctionType;

import java.util.LinkedList;

public class Function extends GlobalVariable
{
    public String functionName;
    //The function type will store in this.type
//    public FunctionType functionType;
    public LinkedList<BasicBlock> blocks;

    public boolean isBuiltin;

    public void accept(IRVisitor visitor){visitor.visit(this);}
}

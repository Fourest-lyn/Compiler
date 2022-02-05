package IR;

import IR.Type.FunctionType;

import java.util.LinkedList;

public class Function
{
    public String functionName;
    public FunctionType functionType;

    public LinkedList<BasicBlock> blocks;

    public boolean isBuiltin;

    public void accept(IRVisitor visitor){visitor.visit(this);}
}

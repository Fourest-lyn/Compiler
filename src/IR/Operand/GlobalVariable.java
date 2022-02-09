package IR.Operand;

import IR.Type.IRType;

//consider: how to use this
public class GlobalVariable extends IROperand
{
    public GlobalVariable(String name, IRType baseType) {super(baseType,name);}

    @Override public String name() {return "@"+name;}
}

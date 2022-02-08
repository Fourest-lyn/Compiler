package IR.Operand;

import IR.Type.IRType;

//consider: how to use this
public class GlobalVariable extends Register
{
    public GlobalVariable(String name, IRType baseType) {super(name,baseType);}

    @Override public String name() {return "@"+name;}
}

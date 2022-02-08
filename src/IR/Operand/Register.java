package IR.Operand;

import IR.Type.IRType;

//consider: This may need delete...?
public class Register extends IROperand
{
    protected String name;
    public Register(String name, IRType baseType)
    {
        super(baseType,name);
        this.name=name;
    }

    @Override
    public String toString()
    {
        return "%"+name;
    }
}

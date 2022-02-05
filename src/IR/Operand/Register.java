package IR.Operand;

import IR.Type.IRType;

public class Register extends IROperand
{
    private String name;
    public Register(String name, IRType baseType)
    {
        super(baseType);
        this.name=name;
    }

    @Override
    public String toString()
    {
        return "%"+name;
    }
}

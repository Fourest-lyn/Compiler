package IR.Type;

import IR.Operand.IROperand;

//todo: to complete this
public class ClassType extends IRType
{
    private String className;
    private int classSize;

    public ClassType(String className)
    {
        classSize=0;
        this.className=className;
    }

    @Override
    public int size()
    {
        return classSize;
    }

    @Override
    public String toString()
    {
        return className; //consider: may need fix
    }

    @Override public IROperand getValue() {return null;}
}

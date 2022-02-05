package IR.Type;

import IR.Operand.IROperand;

public class VoidType extends IRType
{
    @Override public int size() {return 0;}
    @Override public IROperand getValue() {return null;}
    @Override public String toString() {return "void";}
}

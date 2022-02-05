package IR.Type;

import IR.Operand.IROperand;

public class LabelType extends IRType
{
    @Override public int size() {return 0;}
    @Override public String toString() {return "label";}
    @Override public IROperand getValue() {return null;}
}

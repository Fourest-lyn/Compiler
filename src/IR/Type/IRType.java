package IR.Type;

import IR.Operand.IROperand;

abstract public class IRType
{
    abstract public int size();
    abstract public String toString();
    abstract public IROperand getValue();
}

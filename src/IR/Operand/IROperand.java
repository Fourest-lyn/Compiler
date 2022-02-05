package IR.Operand;

import IR.Type.IRType;

abstract public class IROperand
{
    private IRType type;
    public IROperand(IRType type) {this.type=type;}
    abstract public String toString();
}

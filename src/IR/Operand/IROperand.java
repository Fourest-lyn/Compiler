package IR.Operand;

import IR.Base.User;
import IR.Type.IRType;

abstract public class IROperand extends User
{
    public IROperand(IRType type,String name) {super(type,name);}
}

package IR.Type;

import IR.Operand.IROperand;

import java.util.ArrayList;

//This type is use for call-instr, not for Function-Block
public class FunctionType extends IRType
{
    public IRType returnType;//This mast be void or first class type
    public ArrayList<IRType> parameters;

    @Override public int size() {return 0;}
    @Override public String toString() {return "";}
    @Override public IROperand getValue() {return null;}
}

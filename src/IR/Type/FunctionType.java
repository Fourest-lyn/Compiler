package IR.Type;

import IR.Operand.IROperand;

import java.util.ArrayList;

//todo: extend IRType
public class FunctionType extends IRType
{
    public IRType returnType;//This mast be void or first class type
    public ArrayList<IRType> parameters;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public IROperand getValue() {
        return null;
    }
}

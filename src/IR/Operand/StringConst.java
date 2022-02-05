package IR.Operand;

import IR.Type.IntegerType;
import IR.Type.PointerType;

public class StringConst extends IROperand
{
    private String value;
    private String outputValue;

    private void processValue()
    {
        String temp=value;
        temp.replace("\\","\\5C").replace("\n","\\0A");
        temp.replace("\"","\\22").replace("\t","\\09");
        temp.replace("\0","\\00");
        outputValue=temp;
    }

    public StringConst(String value)
    {
        super(new PointerType(new IntegerType(8)));
        this.value=value;
        processValue();
    }

    @Override
    public String toString()
    {
        //todo: may need fix
        return outputValue;
    }
}

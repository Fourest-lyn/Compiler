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
        temp.replace("\\","\\5C")
                .replace("\n","\\0A")
                .replace("\"","\\22")
                .replace("\t","\\09")
                .replace("\0","\\00");
        outputValue="c\""+temp+"\\00\"";
    }

    public StringConst(String value)
    {
        super(new PointerType(new IntegerType(8)),"string_const");
        this.value=value;
        processValue();
    }

    //consider: how to use
    public String formatValue() {return outputValue;}
}

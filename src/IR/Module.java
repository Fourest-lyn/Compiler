package IR;

import IR.BasicBlock;
import IR.Function;
import IR.IRVisitor;

import java.util.LinkedHashMap;

public class Module
{
    public LinkedHashMap<String, Function> functions;
    //todo: add hashMap for classes

    public Module()
    {
        functions=new LinkedHashMap<>();
    }

    public void accept(IRVisitor visitor) {visitor.visit(this);}
}

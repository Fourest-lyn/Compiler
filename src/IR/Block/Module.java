package IR.Block;

import IR.Constructor.IRVisitor;
import IR.Operand.GlobalVariable;
import IR.Operand.StringConst;

import java.util.ArrayList;

public class Module
{
    public ArrayList<Function> functions=new ArrayList<>();
    public ArrayList<Function> builtinFunctions=new ArrayList<>();
    public ArrayList<ClassBlock> classes=new ArrayList<>();
    public ArrayList<GlobalVariable> globals=new ArrayList<>();
    public ArrayList<StringConst> strings=new ArrayList<>();

    private void addBuiltin(Function builtinFunc) {builtinFunctions.add(builtinFunc);}
    public void addFunction(Function func) {functions.add(func);}
    public void addClass(ClassBlock cls) {classes.add(cls);}
    public void addGlobal(GlobalVariable globalVar) {globals.add(globalVar);}
    public void addString(StringConst str) {strings.add(str);}

    public void accept(IRVisitor visitor) {visitor.visit(this);}
}

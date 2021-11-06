package Util.Scope;

import AST.DefineNode.ClassDefine;
import AST.DefineNode.FunctionDefine;
import AST.TypeNode.BaseType;
import Util.Position;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GlobalScope extends Scope
{
    private Map<String,ClassDefine> classes;
//    private Map<String,FunctionDefine> functions;

    public GlobalScope()
    {
        super(null);

        classes =new HashMap<>();
//        functions =new HashMap<>();

        Position pos=new Position(0,0);

        /** Reversed Types */
        classes.put("int",new ClassDefine(pos,"int",null,null,null));
        classes.put("bool",new ClassDefine(pos,"bool",null,null,null));
        classes.put("void",new ClassDefine(pos,"void",null,null,null));
        classes.put("null",new ClassDefine(pos,"null",null,null,null));

        /** Reversed Functions */
        FunctionDefine tempFunction;

        //void print(string str);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"void"),"print");
        tempFunction.paras.addBasic(new BaseType(pos,"string"),"str");
        functions.put("print",tempFunction);

        //void println(string str);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"void"),"println");
        tempFunction.paras.addBasic(new BaseType(pos,"string"),"str");
        functions.put("println",tempFunction);

        //void printInt(int n);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"void"),"printInt");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"n");
        functions.put("printInt",tempFunction);

        //void printlnInt(int n);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"void"),"printlnInt");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"n");
        functions.put("printlnInt",tempFunction);

        //string getString();
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"string"),"getString");
        functions.put("getString",tempFunction);

        //int getInt();
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"int"),"getInt");
        functions.put("getInt",tempFunction);

        //string toString(int i);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"string"),"toString");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"i");
        functions.put("toString",tempFunction);

        /** Class String */
        ArrayList<FunctionDefine> stringFunctions=new ArrayList<>();

        //int length();
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"int"),"length");
        stringFunctions.add(tempFunction);

        //string substring(int left, int right);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"string"),"substring");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"left");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"right");
        stringFunctions.add(tempFunction);

        //int parseInt();
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"int"),"parseInt");
        stringFunctions.add(tempFunction);

        //int ord(int pos);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"int"),"ord");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"pos");
        stringFunctions.add(tempFunction);

        classes.put("string",new ClassDefine(pos,"string",null,null,stringFunctions));
    }

    public boolean checkMainFunction() {return functions.containsKey("main");}

    public void addType(Position pos,String typeName)
    {
        classes.put(typeName,new ClassDefine(pos,typeName,null,null,null));
    }

    public boolean checkType(String typeName) {return classes.containsKey(typeName);}

    public boolean checkForNewName(String typeName)
    {
        boolean out=classes.containsKey(typeName);
        out=out || functions.containsKey(typeName);
        return out;
    }

    public boolean checkFuncName(String funcName) {return functions.containsKey(funcName);}

    public ClassDefine getClass(String className) {return classes.get(className);}

}




















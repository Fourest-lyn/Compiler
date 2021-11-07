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
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"string"),"getString",null,null);
        functions.put("getString",tempFunction);

        //int getInt();
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"int"),"getInt",null,null);
        functions.put("getInt",tempFunction);

        //string toString(int i);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"string"),"toString");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"i");
        functions.put("toString",tempFunction);

        /** Class String */
        ArrayList<FunctionDefine> stringFunctions=new ArrayList<>();
        Scope stringScope=new Scope(this);
        stringScope.classFlag=true;
        stringScope.classType=new BaseType(pos,"string");

        //int length();
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"int"),"length",null,null);
        stringFunctions.add(tempFunction);
        stringScope.putFunction(tempFunction);

        //string substring(int left, int right);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"string"),"substring");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"left");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"right");
        stringFunctions.add(tempFunction);
        stringScope.putFunction(tempFunction);

        //int parseInt();
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"int"),"parseInt",null,null);
        stringFunctions.add(tempFunction);
        stringScope.putFunction(tempFunction);

        //int ord(int pos);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"int"),"ord");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"pos");
        stringFunctions.add(tempFunction);
        stringScope.putFunction(tempFunction);

        ClassDefine stringClass=new ClassDefine(pos,"string",null,null,stringFunctions);
        stringClass.classScope=stringScope;
        classes.put("string",stringClass);
    }

    public boolean checkMainFunction() {return functions.containsKey("main");}

    public void addType(Position pos,String typeName)
    {
        classes.put(typeName,new ClassDefine(pos,typeName,null,null,null));
    }

    public void addClass(ClassDefine def)
    {
        classes.put(def.className,def);
    }

    public void removeClass(String className)
    {
        classes.remove(className);
    }

    public boolean checkType(String typeName) {return classes.containsKey(typeName);}

    public boolean checkForClassName(String typeName)
    {
        boolean out=functions.containsKey(typeName);
        out=out || variables.containsKey(typeName);
        return out;
    }

    public boolean checkFuncName(String funcName) {return functions.containsKey(funcName);}

    public ClassDefine getClass(String className) {return classes.get(className);}

}




















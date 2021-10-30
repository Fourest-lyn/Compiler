package Util.Scope;

import AST.DefineNode.ClassDefine;
import AST.DefineNode.FunctionDefine;
import AST.ToolNode.FunctionParameter;
import AST.TypeNode.ArrayType;
import AST.TypeNode.BaseType;
import AST.TypeNode.VoidType;
import Util.Position;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GlobalScope extends Scope
{
    public Map<String,ClassDefine> reverseClasses;
    public Map<String,FunctionDefine> reverseFunctions;

    public GlobalScope(Scope parentScope)
    {
        super(parentScope);

        reverseClasses=new HashMap<>();
        reverseFunctions=new HashMap<>();

        Position pos=new Position(0,0);

        /** Reversed Types */
        reverseClasses.put("int",new ClassDefine(pos,"int",null,null,null));
        reverseClasses.put("bool",new ClassDefine(pos,"bool",null,null,null));
        reverseClasses.put("void",new ClassDefine(pos,"void",null,null,null));
        reverseClasses.put("null",new ClassDefine(pos,"null",null,null,null));

        /** Reversed Functions */
        FunctionDefine tempFunction;

        //void print(string str);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"void"),"print");
        tempFunction.paras.addBasic(new BaseType(pos,"string"),"str");
        reverseFunctions.put("print",tempFunction);

        //void println(string str);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"void"),"println");
        tempFunction.paras.addBasic(new BaseType(pos,"string"),"str");
        reverseFunctions.put("println",tempFunction);

        //void printInt(int n);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"void"),"printInt");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"n");
        reverseFunctions.put("printInt",tempFunction);

        //void printlnInt(int n);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"void"),"printlnInt");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"n");
        reverseFunctions.put("printlnInt",tempFunction);

        //string getString();
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"string"),"getString");
        reverseFunctions.put("getString",tempFunction);

        //int getInt();
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"int"),"getInt");
        reverseFunctions.put("getInt",tempFunction);

        //string toString(int i);
        tempFunction=new FunctionDefine(pos,new BaseType(pos,"string"),"toString");
        tempFunction.paras.addBasic(new BaseType(pos,"int"),"i");
        reverseFunctions.put("toString",tempFunction);

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

        reverseClasses.put("string",new ClassDefine(pos,"string",null,null,stringFunctions));
    }

    public boolean checkMainFunction() {return reverseFunctions.containsKey("main");}

}




















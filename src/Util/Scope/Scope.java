package Util.Scope;

import AST.DefineNode.FunctionDefine;
import AST.TypeNode.Type;
import Util.Error.SemanticError;
import Util.Position;

import java.util.HashMap;
import java.util.Map;

//This class is used for check the range of a var.
public class Scope
{
    private Scope parentScope;
    public Map<String,FunctionDefine> functions;
    public Map<String, Type> variables;
    public boolean classFlag=false,functionFlag=false;
    public Type classType=null;
    public Type functionType=null;
    public int loopStage=0;

    public Scope(Scope parentScope)
    {
        this.parentScope=parentScope;
        this.variables=new HashMap<>();
        this.functions=new HashMap<>();
    }

    public Scope parentScope() {return parentScope;}

    public void defineVariable(Position pos,Type type,String name)
    {
        if(variables.containsKey(name)) throw new SemanticError(pos,"Redefinition of variable "+name);
        variables.put(name,type);
    }

    public boolean containsVariable(String name,boolean upperCheckFlag)
    {
        if(variables.containsKey(name)) return true;
        if(upperCheckFlag && parentScope!=null) return parentScope.containsVariable(name,true);
        return false;
    }

    public Type getVariable(String name,boolean upperCheckFlag)
    {
        if(variables.containsKey(name)) return variables.get(name);
        if(upperCheckFlag && parentScope!=null) return parentScope.getVariable(name,true);
        return null;
    }

    public boolean containsFunction(String name,boolean upperCheckFlag)
    {
        if(functions.containsKey(name)) return true;
        if(upperCheckFlag && parentScope!=null) return parentScope.containsFunction(name,true);
        return false;
    }



}

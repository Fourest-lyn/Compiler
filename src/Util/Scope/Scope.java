package Util.Scope;

import AST.DefineNode.FunctionDefine;
import AST.DefineNode.ValueDefine;
import AST.ToolNode.FunctionParameter;
import AST.TypeNode.Type;
import Util.Error.SemanticError;
import Util.Position;

import java.util.HashMap;
import java.util.Map;

//This class is used for check the range of a var.
public class Scope
{
    private Scope parentScope;
    protected Map<String,FunctionDefine> functions;
    protected Map<String, Type> variables;
    public boolean classFlag=false,functionFlag=false;
    public Type classType=null;
    public Type functionType=null;
    public int loopStage=0;

    public Scope(Scope parentScope)
    {
        this.parentScope=parentScope;
        this.variables=new HashMap<>();
        this.functions=new HashMap<>();

        if(parentScope!=null)
        {
            this.functionFlag=parentScope.functionFlag;
            this.functionType=parentScope.functionType;
            this.classFlag=parentScope.classFlag;
            this.classType=parentScope.classType;
            this.loopStage=parentScope.loopStage;
        }
    }

    public Scope parentScope() {return parentScope;}

    public void defineVariable(Position pos,Type type,String name)
    {
        if(variables.containsKey(name)) throw new SemanticError(pos,"Redefinition of variable "+name);
        variables.put(name,type);
    }

    public boolean checkVariable(String name, boolean upperCheckFlag)
    {
        if(variables.containsKey(name)) return true;
        if(upperCheckFlag && parentScope!=null) return parentScope.checkVariable(name,true);
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

    public void putParameters(FunctionParameter paras)
    {
        for(int i=0;i<paras.names.size();++i)
            variables.put(paras.names.get(i),paras.types.get(i));
    }

    public void putVariable(Type type,String name) {variables.put(name,type);}

    public void putVariables(ValueDefine def)
    {
        for(var it: def.valueDefs)
            variables.put(it.name,it.type);
    }

    public void putFunction(FunctionDefine def) {functions.put(def.funcName,def);}

    public FunctionDefine getFunction(String funcName,boolean upperCheckFlag)
    {
        if(functions.containsKey(funcName)) return functions.get(funcName);
        if(upperCheckFlag && parentScope!=null) return parentScope.getFunction(funcName,true);
        return null;
    }
}

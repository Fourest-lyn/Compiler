package Util.Scope;

import AST.DefineNode.ClassDefine;

import java.util.HashMap;
import java.util.Map;

public class GlobalScope extends Scope
{
    public Map<String,ClassDefine> classes;


    public GlobalScope(Scope parentScope)
    {
        super(parentScope);
        classes=new HashMap<>();
    }
}

package IR.Base;

import IR.Type.IRType;

import java.util.ArrayList;
import java.util.HashMap;

public class Value
{
    private static HashMap<String,Integer> renameTable;

    public IRType type;
    protected String name;

    public Value(IRType type,String name)
    {
        this.type=type;
        this.name=name;//todo: need to rename it
    }

    public String name() {return "%"+this.name;}
    public String print() {return type.toString()+" "+name();}


    protected ArrayList<User> users;

    protected void addUser(User user) {users.add(user);}
}

package IR.Base;

import IR.Type.IRType;

import java.util.ArrayList;

public class User extends Value
{
    protected final ArrayList<Value> operands=new ArrayList<>();

    public User(IRType type,String name) {super(type,name);}

    public void addOperand(Value value)
    {
        addUser(this);//consider: This is why
        operands.add(value);
    }

    public Value getOperand(int index) {return operands.get(index);}

    public int listSize() {return operands.size();}


}

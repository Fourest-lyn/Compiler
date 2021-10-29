package AST.TypeNode;

import AST.ASTNode;
import AST.ASTVisitor;
import Util.Position;

abstract public class Type extends ASTNode
{
    private String typeName;
    public Type(Position pos,String name)
    {
        super(pos);
        this.typeName=name;
    }

    public String typeName() {return typeName;}

    public boolean equals(Object obj)
    {
        if(obj instanceof Type) return typeName().equals(((Type) obj).typeName());
        return false;
    }

}

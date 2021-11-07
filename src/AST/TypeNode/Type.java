package AST.TypeNode;

import AST.ASTNode;
import AST.ASTVisitor;
import Util.Position;

abstract public class Type extends ASTNode
{
    private final String typeName;

    public Type(Position pos,String name)
    {
        super(pos);
        this.typeName=name;
    }

    public String typeName() {return typeName;}

    abstract public boolean equals(Object obj);

}

package AST.ToolNode;

import AST.ASTVisitor;
import AST.TypeNode.BaseType;
import Util.Position;

public class ArrayInitial extends NewType
{
    public int dimension;

    public ArrayInitial(Position pos, BaseType baseType,int dimension)
    {
        super(pos,baseType);
        this.dimension=dimension;
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

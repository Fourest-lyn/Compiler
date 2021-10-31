package AST.ToolNode;

import AST.ASTVisitor;
import AST.ExprNode.Expression;
import AST.TypeNode.BaseType;
import Util.Position;

import java.util.ArrayList;

public class ArrayInitial extends NewType
{
    public BaseType baseType;
    public ArrayList<Expression> expressions;
    public int dimension;

    public ArrayInitial(Position pos, BaseType baseType,ArrayList<Expression> expressions)
    {
        super(pos,baseType);
        this.expressions=expressions;
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

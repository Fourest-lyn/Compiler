package AST.ToolNode;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.ExprNode.Expression;
import Util.Position;

import java.util.ArrayList;

public class ValueList extends ASTNode
{
    public ArrayList<Expression> expressions;

    public ValueList(Position pos,ArrayList<Expression> expressions)
    {
        super(pos);
        this.expressions=expressions;
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

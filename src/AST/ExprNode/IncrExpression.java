package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class IncrExpression extends Expression
{
    public IncrExpression(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

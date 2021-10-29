package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class IdExpression extends Expression
{
    public IdExpression(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

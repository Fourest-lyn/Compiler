package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class BinaryExpression extends Expression
{
    public BinaryExpression(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

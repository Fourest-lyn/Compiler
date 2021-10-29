package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class IndexExpression extends Expression
{
    public IndexExpression(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

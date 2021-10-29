package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class FuncExpression extends Expression
{
    public FuncExpression(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

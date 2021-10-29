package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class AssignExpression extends Expression
{
    public AssignExpression(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

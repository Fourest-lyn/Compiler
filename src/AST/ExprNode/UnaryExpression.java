package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class UnaryExpression extends Expression
{
    public UnaryExpression(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

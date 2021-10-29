package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class ClassExpression extends Expression
{
    public ClassExpression(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class LambdaExpression extends Expression
{
    //todo

    public LambdaExpression(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

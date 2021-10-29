package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class NewExpression extends Expression
{
    //todo:

    public NewExpression(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

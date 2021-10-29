package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class ConstExpression extends Expression
{


    public ConstExpression(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

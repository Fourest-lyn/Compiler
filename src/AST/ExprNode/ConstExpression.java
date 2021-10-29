package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class ConstExpression extends Expression
{
    public ConstExpression(Position pos)
    {
        super(pos);
        this.constFlag=true;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

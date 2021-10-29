package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class IdExpression extends Expression
{
    public Expression identifier;

    public IdExpression(Position pos,Expression identifier)
    {
        super(pos);
        this.identifier=identifier;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

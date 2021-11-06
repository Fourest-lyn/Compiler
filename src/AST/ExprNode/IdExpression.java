package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class IdExpression extends Expression
{
    public String identifier;

    public IdExpression(Position pos,String identifier)
    {
        super(pos);
        this.identifier=identifier;
        this.leftFlag=true;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

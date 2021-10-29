package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class AssignExpression extends Expression
{
    public Expression leftExpr,rightExpr;

    public AssignExpression(Position pos,Expression leftExpr,Expression rightExpr)
    {
        super(pos);
        this.leftExpr=leftExpr;
        this.rightExpr=rightExpr;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

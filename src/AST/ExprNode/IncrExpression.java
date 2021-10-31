package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class IncrExpression extends Expression
{
    public enum Operator{SELFINC,SELFDEC}
    public Operator op;
    public Expression leftExpr;

    public IncrExpression(Position pos, Operator op, Expression leftExpr)
    {
        super(pos);
        this.op=op;
        this.leftExpr=leftExpr;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class IncrExpression extends Expression
{
    public enum Operator{SELFINC,SELFDEC}
    public Operator op;
    public Expression leftExpr;

    public IncrExpression(Position pos,Expression leftExpr,Operator op)
    {
        super(pos);
        this.leftExpr=leftExpr;
        this.op=op;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

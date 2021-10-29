package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class UnaryExpression extends Expression
{
    public enum Operator{LNOT,BITNOT,NEG,POS,SELFINC,SELFDEC}
    public Operator op;
    public Expression rightExpr;

    public UnaryExpression(Position pos,Operator op,Expression rightExpr)
    {
        super(pos);
        this.op=op;
        this.rightExpr=rightExpr;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

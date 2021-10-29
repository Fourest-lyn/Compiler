package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class BinaryExpression extends Expression
{
    public enum Operator{MUL,DIV,MOD,SHL,SHR,GRE,LES,GEQ,LEQ,EQ,NEQ,AND,OR,XOR,LAND,LOR,ADD,SUB}
    public Operator op;
    public Expression leftExpr,rightExpr;

    public BinaryExpression(Position pos,Operator op,Expression leftExpr,Expression rightExpr)
    {
        super(pos);
        this.op=op;
        this.leftExpr=leftExpr;
        this.rightExpr=rightExpr;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

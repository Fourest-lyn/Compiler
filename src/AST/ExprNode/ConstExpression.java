package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class ConstExpression extends Expression
{
    public enum ConstKind{INTEGER,STRING,BOOL,NULL}
    public ConstKind kind;

    public ConstExpression(Position pos,ConstKind kind)
    {
        super(pos);
        this.constFlag=true;
        this.kind=kind;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

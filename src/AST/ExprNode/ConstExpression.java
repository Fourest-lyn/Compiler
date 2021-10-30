package AST.ExprNode;

import AST.ASTVisitor;
import AST.TypeNode.BaseType;
import Util.Position;

public class ConstExpression extends Expression
{
    public String kind;

    public ConstExpression(Position pos,String kind)
    {
        super(pos);
        this.constFlag=true;
        this.kind=kind;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

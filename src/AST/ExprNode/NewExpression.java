package AST.ExprNode;

import AST.ASTVisitor;
import AST.ToolNode.NewType;
import Util.Position;

public class NewExpression extends Expression
{
    public NewType newType;

    public NewExpression(Position pos,NewType newType)
    {
        super(pos);
        this.newType=newType;
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

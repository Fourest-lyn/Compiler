package AST.ExprNode;

import AST.ASTVisitor;
import AST.ToolNode.LambdaFunction;
import Util.Position;

public class LambdaExpression extends Expression
{
    public LambdaFunction lambda;
    public LambdaExpression(Position pos,LambdaFunction lambda)
    {
        super(pos);
        this.lambda=lambda;
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

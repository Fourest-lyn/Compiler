package AST.ExprNode;

import AST.ASTVisitor;
import AST.ToolNode.LambdaFunction;
import Util.Position;

public class ThisExpression extends Expression
{
    public ThisExpression(Position pos) {super(pos);}

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

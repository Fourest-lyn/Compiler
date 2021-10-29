package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

public class IndexExpression extends Expression
{
    public Expression name,index;
    public IndexExpression(Position pos,Expression name,Expression index)
    {
        super(pos);
        this.name=name;
        this.index=index;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

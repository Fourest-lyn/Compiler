package AST.DefineNode;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.ExprNode.Expression;
import AST.TypeNode.Type;
import Util.Position;

public class SingleDefine extends ASTNode
{
    public Type type;
    public String name;
    public Expression expr;

    public SingleDefine(Position pos,String name,Expression expr)
    {
        super(pos);
        this.name=name;
        this.expr=expr;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

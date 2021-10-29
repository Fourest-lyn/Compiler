package AST.StmtNode;

import AST.ASTVisitor;
import AST.ExprNode.Expression;
import Util.Position;

public class ReturnStatement extends Statement
{
    public Expression expr;

    public ReturnStatement(Position pos,Expression expr)
    {
        super(pos);
        this.expr=expr;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

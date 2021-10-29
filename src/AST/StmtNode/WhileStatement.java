package AST.StmtNode;

import AST.ASTVisitor;
import AST.ExprNode.Expression;
import Util.Position;

public class WhileStatement extends Statement
{
    public Expression condition;
    public Statement stmt;

    public WhileStatement(Position pos,Expression condition,Statement stmt)
    {
        super(pos);
        this.condition=condition;
        this.stmt=stmt;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

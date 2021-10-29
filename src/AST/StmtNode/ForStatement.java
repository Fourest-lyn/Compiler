package AST.StmtNode;

import AST.ASTVisitor;
import AST.ExprNode.Expression;
import Util.Position;

public class ForStatement extends Statement
{
    public Expression init,condition,incr;
    public Statement stmt;

    public ForStatement(Position pos,Expression init,Expression condition,Expression incr,Statement stmt)
    {
        super(pos);
        this.init=init;
        this.condition=condition;
        this.incr=incr;
        this.stmt=stmt;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

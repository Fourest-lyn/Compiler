package AST.StmtNode;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.ExprNode.Expression;
import Util.Position;

public class IfStatement extends Statement
{
    public Expression flag;
    public Statement trueStmt,falseStmt;

    public IfStatement(Position pos,Expression flag,Statement trueStmt,Statement falseStmt)
    {
        super(pos);
        this.flag=flag;
        this.trueStmt=trueStmt;
        this.falseStmt=falseStmt;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

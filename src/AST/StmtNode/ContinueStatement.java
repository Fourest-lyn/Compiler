package AST.StmtNode;

import AST.ASTNode;
import AST.ASTVisitor;
import Util.Position;

public class ContinueStatement extends Statement
{
    public ASTNode destination;

    public ContinueStatement(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

package AST.StmtNode;

import AST.ASTNode;
import AST.ASTVisitor;
import Util.Position;

public class BreakStatement extends Statement
{
    public ASTNode destination;

    public BreakStatement(Position pos) {super(pos);}

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

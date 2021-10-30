package AST.StmtNode;

import AST.ASTVisitor;
import Util.Position;

public class EmptyStatement extends Statement
{
    public EmptyStatement(Position pos) {super(pos);}

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

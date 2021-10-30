package AST.ToolNode;

import AST.ASTNode;
import AST.ASTVisitor;
import Util.Position;

public class WrongInitial extends ASTNode
{
    public WrongInitial(Position pos) {super(pos);}
    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

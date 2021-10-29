package AST.StmtNode;

import AST.ASTNode;
import Util.Position;

abstract public class Statement extends ASTNode
{
    public Statement(Position pos)
    {
        super(pos);
    }
}

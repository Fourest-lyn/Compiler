package AST.ExprNode;

import AST.ASTNode;
import Util.Position;

abstract public class Expression extends ASTNode
{
    public boolean constFlag=false;

    public Expression(Position pos) {super(pos);}
}

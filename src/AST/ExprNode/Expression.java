package AST.ExprNode;

import AST.ASTNode;
import AST.TypeNode.Type;
import Util.Position;

abstract public class Expression extends ASTNode
{
    public boolean constFlag=false;
    public boolean leftFlag=false;
    public boolean nullFlag=false;
    public Type type;

    public Expression(Position pos) {super(pos);}
}

package AST;

import IR.Base.Value;
import Util.Position;

abstract public class ASTNode
{
    public Position pos;
    public Value value=null;

    public ASTNode(Position pos) {this.pos=pos;}

    abstract public void accept(ASTVisitor visitor);
}

package AST.DefineNode;

import AST.ASTNode;
import AST.ASTVisitor;
import Util.Position;

public class ValueDefine extends ASTNode
{
    //todo


    public ValueDefine(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

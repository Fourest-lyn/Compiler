package AST.DefineNode;

import AST.ASTNode;
import AST.ASTVisitor;
import Util.Position;

public class ClassDefine extends ASTNode
{
    public ClassDefine(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

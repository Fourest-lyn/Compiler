package AST.DefineNode;

import AST.ASTNode;
import AST.ASTVisitor;
import Util.Position;

public class FunctionDefine extends ASTNode
{
    public FunctionDefine(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

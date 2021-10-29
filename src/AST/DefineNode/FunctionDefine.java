package AST.DefineNode;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.TypeNode.Type;
import Util.Position;

public class FunctionDefine extends ASTNode
{
    //todo
    public Type returnType;
    public String funcName;


    public FunctionDefine(Position pos)
    {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

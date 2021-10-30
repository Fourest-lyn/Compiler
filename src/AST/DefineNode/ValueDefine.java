package AST.DefineNode;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.TypeNode.Type;
import Util.Position;

import java.util.ArrayList;

public class ValueDefine extends Define
{
    public Type type;
    public ArrayList<SingleDefine> valueDefs;

    public ValueDefine(Position pos,Type type,ArrayList<SingleDefine> valueDefs)
    {
        super(pos);
        this.type=type;
        this.valueDefs=valueDefs;
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

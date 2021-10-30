package AST.ToolNode;

import AST.ASTVisitor;
import AST.TypeNode.BaseType;
import Util.Position;

public class ObjectInitial extends NewType
{
    public ObjectInitial(Position pos, BaseType baseType) {super(pos,baseType);}
    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

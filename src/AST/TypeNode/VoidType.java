package AST.TypeNode;

import AST.ASTVisitor;
import Util.Position;

public class VoidType extends Type
{
    public VoidType(Position pos) {super(pos,"void");}

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
    @Override public boolean equals(Object obj) {return (obj instanceof VoidType);}
}

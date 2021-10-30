package AST.ToolNode;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.TypeNode.ArrayType;
import Util.Position;

import java.util.ArrayList;

public class FunctionParameter extends ASTNode
{
    public ArrayList<ArrayType> types;
    public ArrayList<String> names;

    public FunctionParameter(Position pos,ArrayList<ArrayType> types,ArrayList<String> names)
    {
        super(pos);
        this.types=types;
        this.names=names;
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

package AST.ToolNode;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.TypeNode.ArrayType;
import AST.TypeNode.BaseType;
import AST.TypeNode.Type;
import Util.Position;

import java.util.ArrayList;

public class FunctionParameter extends ASTNode
{
    public ArrayList<Type> types;
    public ArrayList<String> names;

    public FunctionParameter(Position pos,ArrayList<Type> types,ArrayList<String> names)
    {
        super(pos);
        this.types=types;
        this.names=names;
    }

    public FunctionParameter(Position pos)
    {
        super(pos);
        types=new ArrayList<>();
        names=new ArrayList<>();
    }

    public void addBasic(BaseType baseType,String name)
    {
        types.add(new ArrayType(this.pos,baseType));
        names.add(name);
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

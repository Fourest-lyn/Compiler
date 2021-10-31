package AST.ToolNode;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.ExprNode.Expression;
import AST.TypeNode.BaseType;
import AST.TypeNode.Type;
import Util.Position;

import java.util.ArrayList;

abstract public class NewType extends ASTNode
{
    public Type type;

    public NewType(Position pos,Type type)
    {
        super(pos);
        this.type=type;
    }
}

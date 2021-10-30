package AST.ToolNode;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.ExprNode.Expression;
import AST.TypeNode.BaseType;
import Util.Position;

import java.util.ArrayList;

abstract public class NewType extends ASTNode
{
    public BaseType baseType;

    public NewType(Position pos,BaseType baseType)
    {
        super(pos);
        this.baseType=baseType;
    }
}

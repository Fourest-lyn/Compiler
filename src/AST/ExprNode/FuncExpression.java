package AST.ExprNode;

import AST.ASTVisitor;
import AST.ToolNode.ValueList;
import Util.Position;

import java.util.ArrayList;

public class FuncExpression extends Expression
{
    public String funcName;
    public ValueList values;

    public FuncExpression(Position pos,String funcName,ValueList values)
    {
        super(pos);
        this.funcName=funcName;
        this.values=values;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

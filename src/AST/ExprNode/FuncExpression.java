package AST.ExprNode;

import AST.ASTVisitor;
import Util.Position;

import java.util.ArrayList;

public class FuncExpression extends Expression
{
    public Expression funcName;
    public ArrayList<Expression> values;

    public FuncExpression(Position pos,Expression funcName,ArrayList<Expression> values)
    {
        super(pos);
        this.funcName=funcName;
        this.values=values;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

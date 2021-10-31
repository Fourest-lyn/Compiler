package AST.ExprNode;

import AST.ASTVisitor;
import AST.ToolNode.ValueList;
import Util.Position;

public class ClassExpression extends Expression
{
    public String objectName;
    public String methodName;
    public boolean functionFlag;
    public ValueList values;

    public ClassExpression(Position pos,String objectName,String methodName,ValueList values,boolean functionFlag)
    {
        super(pos);
        this.objectName =objectName;
        this.methodName=methodName;
        this.functionFlag=functionFlag;
        this.values=values;
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

package AST.StmtNode;

import AST.ASTVisitor;
import AST.DefineNode.ValueDefine;
import Util.Position;

public class ValueDefStatement extends Statement
{
    public ValueDefine valueDefine;
    public ValueDefStatement(Position pos,ValueDefine valueDefine)
    {
        super(pos);
        this.valueDefine=valueDefine;
    }

    @Override public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

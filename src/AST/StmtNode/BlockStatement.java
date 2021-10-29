package AST.StmtNode;

import AST.ASTVisitor;
import Util.Position;

import java.util.ArrayList;

public class BlockStatement extends Statement
{
    public ArrayList<Statement> stmts;

    public BlockStatement(Position pos)
    {
        super(pos);
        this.stmts=new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

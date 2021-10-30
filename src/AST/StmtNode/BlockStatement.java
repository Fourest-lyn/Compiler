package AST.StmtNode;

import AST.ASTVisitor;
import Util.Position;

import java.util.ArrayList;

public class BlockStatement extends Statement
{
    public ArrayList<Statement> stmts;

    public BlockStatement(Position pos,ArrayList<Statement> stmts)
    {
        super(pos);
        this.stmts=stmts;
    }

    @Override
    public void accept(ASTVisitor visitor) {visitor.visit(this);}
}

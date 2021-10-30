package AST.DefineNode;

import AST.ASTNode;
import AST.ASTVisitor;
import Util.Position;

import java.util.ArrayList;

public class ClassDefine extends Define
{
    public String className;
    public ArrayList<ValueDefine> valueDefs;
    public ArrayList<ConstructDefine> consDefs;
    public ArrayList<FunctionDefine> funcDefs;

    public ClassDefine(Position pos,String className,ArrayList<ValueDefine> valueDefs,ArrayList<ConstructDefine> consDefs,ArrayList<FunctionDefine> funcDefs)
    {
        super(pos);
        this.className=className;
        this.consDefs=consDefs;
        this.valueDefs=valueDefs;
        this.funcDefs=funcDefs;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

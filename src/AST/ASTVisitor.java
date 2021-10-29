package AST;

import AST.DefineNode.ClassDefine;
import AST.DefineNode.ConstructDefine;
import AST.DefineNode.FunctionDefine;
import AST.DefineNode.ValueDefine;
import AST.ExprNode.*;
import AST.StmtNode.*;
import AST.TypeNode.BaseType;
import AST.TypeNode.VoidType;

public interface ASTVisitor
{
    public void visit(RootNode node);

    public void visit(IfStatement       stmt);
    public void visit(ReturnStatement   stmt);
    public void visit(BreakStatement    stmt);
    public void visit(ContinueStatement stmt);
    public void visit(WhileStatement    stmt);
    public void visit(ForStatement      stmt);
    public void visit(ExprStatement     stmt);
    public void visit(BlockStatement    stmt);

    public void visit(BinaryExpression  expr);
    public void visit(AssignExpression  expr);
    public void visit(NewExpression     expr);
    public void visit(ConstExpression   expr);
    public void visit(IdExpression      expr);
    public void visit(IncrExpression    expr);
    public void visit(ClassExpression   expr);
    public void visit(IndexExpression   expr);
    public void visit(FuncExpression    expr);
    public void visit(UnaryExpression   expr);
    public void visit(LambdaExpression  expr);

    public void visit(ValueDefine       def);
    public void visit(FunctionDefine    def);
    public void visit(ClassDefine       def);
    public void visit(ConstructDefine   def);

    public void visit(BaseType          type);
    public void visit(VoidType          type);
}

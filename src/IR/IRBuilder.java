package IR;

import AST.ASTVisitor;
import AST.DefineNode.*;
import AST.ExprNode.*;
import AST.ProgramNode;
import AST.StmtNode.*;
import AST.ToolNode.*;
import AST.TypeNode.ArrayType;
import AST.TypeNode.BaseType;
import AST.TypeNode.VoidType;

public class IRBuilder implements ASTVisitor
{
    //todo: add reserved functions

    @Override public void visit(ProgramNode node) {}

    @Override public void visit(IfStatement stmt) {}
    @Override public void visit(ReturnStatement stmt) {}
    @Override public void visit(BreakStatement stmt) {}
    @Override public void visit(ContinueStatement stmt) {}
    @Override public void visit(WhileStatement stmt) {}
    @Override public void visit(ForStatement stmt) {}
    @Override public void visit(ExprStatement stmt) {}
    @Override public void visit(BlockStatement stmt) {}
    @Override public void visit(EmptyStatement stmt) {}
    @Override public void visit(ValueDefStatement stmt) {}

    @Override public void visit(BinaryExpression expr) {}
    @Override public void visit(AssignExpression expr) {}
    @Override public void visit(NewExpression expr) {}
    @Override public void visit(ConstExpression expr) {}
    @Override public void visit(IdExpression expr) {}
    @Override public void visit(ClassExpression expr) {}
    @Override public void visit(IndexExpression expr) {}
    @Override public void visit(FuncExpression expr) {}
    @Override public void visit(UnaryExpression expr) {}
    @Override public void visit(LambdaExpression expr) {}
    @Override public void visit(ThisExpression expr) {}
    @Override public void visit(IncrExpression expr) {}

    @Override public void visit(ValueDefine def) {}
    @Override public void visit(FunctionDefine def) {}
    @Override public void visit(ClassDefine def) {}
    @Override public void visit(ConstructDefine def) {}
    @Override public void visit(SingleDefine def) {}

    @Override public void visit(BaseType type) {}
    @Override public void visit(ArrayType type) {}
    @Override public void visit(VoidType type) {}

    @Override public void visit(ValueList tool) {}
    @Override public void visit(ObjectInitial tool) {}
    @Override public void visit(FunctionParameter tool) {}
    @Override public void visit(LambdaFunction tool) {}
    @Override public void visit(ArrayInitial tool) {}
    @Override public void visit(WrongInitial tool) {}
}

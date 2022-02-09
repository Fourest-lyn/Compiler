package IR.Constructor;

import AST.ASTVisitor;
import AST.DefineNode.*;
import AST.ExprNode.*;
import AST.ProgramNode;
import AST.StmtNode.*;
import AST.ToolNode.*;
import AST.TypeNode.ArrayType;
import AST.TypeNode.BaseType;
import AST.TypeNode.VoidType;
import IR.Base.Value;
import IR.Block.BasicBlock;
import IR.Block.Module;
import IR.Instruction.BrInstr;
import IR.Instruction.LoadInstr;
import IR.Instruction.StoreInstr;
import IR.Type.PointerType;

public class IRBuilder implements ASTVisitor
{
    private IRScope cur=new IRScope();

    public Module module=new Module();
    public IRBuilder(ProgramNode node) {this.visit(node);}

    @Override public void visit(ProgramNode node) {}

    /** stmt
     * The "value" of statements will not be assigned, always be null.
     */
    @Override public void visit(IfStatement stmt)
    {
        BasicBlock trueBlock=new BasicBlock("trueStmt",cur.getFunctionBlock());
        BasicBlock falseBlock=new BasicBlock("falseBlock",cur.getFunctionBlock());
        BasicBlock nextBlock=new BasicBlock("next",cur.getFunctionBlock());

        stmt.flag.accept(this);
        new BrInstr(stmt.flag.value,trueBlock,falseBlock,cur.getBasicBlock());

        cur.setBasicBlock(trueBlock);
        stmt.trueStmt.accept(this);
        new BrInstr(nextBlock,cur.getBasicBlock());

        cur.setBasicBlock(falseBlock);
        stmt.falseStmt.accept(this);
        new BrInstr(nextBlock,cur.getBasicBlock());

        cur.setBasicBlock(nextBlock);
    }

    @Override public void visit(ReturnStatement stmt)
    {
        if(stmt.expr!=null && !(stmt.expr.type instanceof VoidType))
        {
            stmt.expr.accept(this);
            newStoreInstr(cur.getFunctionBlock().getRetPtr(),stmt.expr.value);
        }
        new BrInstr(cur.getFunctionBlock().exit(),cur.getBasicBlock());
    }

    @Override public void visit(WhileStatement stmt)
    {
        BasicBlock condition=new BasicBlock("cond",cur.getFunctionBlock());
        BasicBlock cycleBody=new BasicBlock("body",cur.getFunctionBlock());
        BasicBlock nextBlock=new BasicBlock("next",cur.getFunctionBlock());

        new BrInstr(condition,cur.getBasicBlock());

        cur.setBasicBlock(condition);
        stmt.condition.accept(this);
        new BrInstr(stmt.condition.value,cycleBody,nextBlock,cur.getBasicBlock());

        cur.setBasicBlock(cycleBody);
        cur.pushTarget(nextBlock,condition);
        stmt.stmt.accept(this);
        new BrInstr(condition,cur.getBasicBlock());
        cur.popTarget();

        cur.setBasicBlock(nextBlock);
    }

    @Override public void visit(ForStatement stmt)
    {
        BasicBlock condition=new BasicBlock("cond",cur.getFunctionBlock());
        BasicBlock cycleBody=new BasicBlock("body",cur.getFunctionBlock());
        BasicBlock nextBlock=new BasicBlock("next",cur.getFunctionBlock());
        BasicBlock incrBlock=new BasicBlock("incr",cur.getFunctionBlock());

        //First initial the counter
        if(stmt.init!=null) stmt.init.accept(this);
        new BrInstr(condition, cur.getBasicBlock());

        cur.setBasicBlock(condition);//Maybe have no condition part. check it!
        stmt.condition.accept(this);
        new BrInstr(stmt.condition.value,cycleBody,nextBlock,cur.getBasicBlock());

        cur.setBasicBlock(cycleBody);
        cur.pushTarget(nextBlock,incrBlock);
        stmt.stmt.accept(this);
        new BrInstr(incrBlock, cur.getBasicBlock());
        cur.popTarget();

        //Put the incr part after cycle body, make condition judgement smooth
        cur.setBasicBlock(incrBlock);
        if(stmt.incr!=null) stmt.incr.accept(this);
        new BrInstr(condition, cur.getBasicBlock());

        cur.setBasicBlock(nextBlock);
    }

    @Override public void visit(BreakStatement stmt) {cur.newBreakInstr();}
    @Override public void visit(ContinueStatement stmt) {cur.newContinueInstr();}
    @Override public void visit(ExprStatement stmt) {stmt.expr.accept(this);}
    @Override public void visit(BlockStatement stmt) {for(var it:stmt.stmts) it.accept(this);}
    @Override public void visit(EmptyStatement stmt) {/*Nothing here*/}
    @Override public void visit(ValueDefStatement stmt) {stmt.valueDefine.accept(this);}

    /** expr
     * The value of expression will be store into "value" of "expr"
     */
    @Override public void visit(BinaryExpression expr) {}
    @Override public void visit(AssignExpression expr)
    {
        expr.leftExpr.accept(this);
        expr.rightExpr.accept(this);
        newStoreInstr(expr.leftExpr.value.resolveFrom,expr.rightExpr.value);
        expr.value=expr.rightExpr.value;
        expr.value.resolveFrom=expr.leftExpr.value.resolveFrom;
    }

    @Override public void visit(NewExpression expr) {}
    @Override public void visit(ConstExpression expr) {}
    @Override public void visit(IdExpression expr) {}
    @Override public void visit(ClassExpression expr) {}
    @Override public void visit(IndexExpression expr)
    {
        expr.name.accept(this);
        expr.index.accept(this);
//        memLoad("",);
        //todo: complete this
    }

    @Override public void visit(FuncExpression expr) {}
    @Override public void visit(UnaryExpression expr) {}
    @Override public void visit(LambdaExpression expr) {}
    @Override public void visit(ThisExpression expr) {}
    @Override public void visit(IncrExpression expr) {}

    /** def
     */
    @Override public void visit(ValueDefine def) {}
    @Override public void visit(FunctionDefine def) {}
    @Override public void visit(ClassDefine def) {}
    @Override public void visit(ConstructDefine def) {}
    @Override public void visit(SingleDefine def) {}

    /** type
     */
    @Override public void visit(BaseType type) {}
    @Override public void visit(ArrayType type) {}
    @Override public void visit(VoidType type) {}

    /** tool
     */
    @Override public void visit(ValueList tool) {}
    @Override public void visit(ObjectInitial tool) {}
    @Override public void visit(FunctionParameter tool) {}
    @Override public void visit(LambdaFunction tool) {}
    @Override public void visit(ArrayInitial tool) {}
    @Override public void visit(WrongInitial tool) {}

    /** private functions
     * Under this are some tool functions.
     */
    private void newStoreInstr(Value dest, Value storeData)
    {
        assert dest.type instanceof PointerType;
        //consider: to check whether the type of dest and storeData is the same
        new StoreInstr(dest,storeData,cur.getBasicBlock());
    }

    private void newLoadInstr(String name, Value valuePtr)
    {
        //todo: to complete this one.
        assert valuePtr.type instanceof PointerType;
        //consider: to check whether the type of dest and storeData is the same
        new LoadInstr(name,valuePtr,cur.getBasicBlock());
    }
}

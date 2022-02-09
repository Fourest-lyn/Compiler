package IR.Constructor;

import IR.Block.BasicBlock;
import IR.Block.ClassBlock;
import IR.Block.Function;
import IR.Instruction.BrInstr;

import java.util.Stack;

public class IRScope
{
    private BasicBlock bbk=null;
    private Function fbk=null;
    private ClassBlock cbk=null;

    public BasicBlock getBasicBlock() {return bbk;}
    public Function getFunctionBlock() {return fbk;}
    public ClassBlock getClassBlock() {return cbk;}

    public void setBasicBlock(BasicBlock _bbk) {bbk=_bbk;}
    public void setFunctionBlock(Function _fbk) {fbk=_fbk;}
    public void setClassBlock(ClassBlock _cbk) {cbk=_cbk;}

    //For cycle process, stack for cycle target
    private Stack<BasicBlock> breakStack=new Stack<>();
    private Stack<BasicBlock> continueStack=new Stack<>();

    public void pushTarget(BasicBlock breakTarget,BasicBlock continueTarget)
    {
        breakStack.push(breakTarget);
        continueStack.push(continueTarget);
    }

    public void popTarget()
    {
        breakStack.pop();
        continueStack.pop();
    }

    public void newBreakInstr() {new BrInstr(breakStack.peek(),getBasicBlock());}
    public void newContinueInstr() {new BrInstr(continueStack.peek(),getBasicBlock());}

}

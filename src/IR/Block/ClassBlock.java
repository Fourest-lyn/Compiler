package IR.Block;

import IR.Base.Value;
import IR.Constructor.IRVisitor;
import IR.Type.ClassType;

public class ClassBlock extends Value
{
    public ClassBlock(String className,ClassType classType)
    {
        super(classType,className);
    }

    public void accept(IRVisitor visitor) {visitor.visit(this);}
}

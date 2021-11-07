package Util.Error;

import Util.Position;

public class SyntaxError extends Error
{
    public SyntaxError(Position pos,String msg)
    {
        super(pos,"[Syntax Error] "+msg);
    }
}

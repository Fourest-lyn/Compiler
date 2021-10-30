package Util.Error;

import Util.Position;

public class InternalError extends Error
{
    public InternalError(Position pos,String msg)
    {
        super(pos,"Internal Error: "+msg);
    }
}

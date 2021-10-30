package Util.Error;

import Util.Position;

public class Error extends RuntimeException
{
    private final Position pos;
    private final String msg;
    public Error(Position pos,String msg)
    {
        this.msg=msg;
        this.pos=pos;
    }

    public String toString()
    {
        return msg+": "+pos.toString();
    }
}

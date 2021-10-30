package Util.Error;

import Util.Position;

public class SemanticError extends Error
{
    public SemanticError(Position pos,String msg)
    {
        super(pos,"Semantic Error: "+msg);
    }
}

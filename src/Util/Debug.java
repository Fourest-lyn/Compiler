package Util;

public class Debug
{
    private boolean debugFlag=true;
    public void print(String str)
    {
        if(!debugFlag) return;
        System.out.println("[Debug]: "+str);
    }
    public void module(String str)
    {
        if(!debugFlag) return;
        System.out.println("["+str+"]");
    }
    public void builder(String str1,String str2)
    {
        if(!debugFlag) return;
        System.out.println("<"+str1+">\t"+str2);
    }
}

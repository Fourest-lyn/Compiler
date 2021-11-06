import AST.ProgramNode;
import FrontEnd.ASTBuilder;
import FrontEnd.SemanticChecker;
import Parser.MxLexer;
import Parser.MxParser;
import Util.Error.Error;
import Util.MxErrorListener;
import Util.Scope.GlobalScope;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;

/**
 * This is a compiler for language Mx*
 * This project hasn't complete yet.
 * Author: Fourest
 */


public class Main
{
    public static void main(String[] args) throws Exception
    {
        // Only semantic check now.
        boolean semanticCheckLocalFlag=true;
        var input=System.in;

        if(semanticCheckLocalFlag)
        {
            input=new FileInputStream("testcases/sema/basic-package/basic-6.mx");
        }
        try
        {

            MxLexer lexer=new MxLexer(CharStreams.fromStream(input));
            MxParser parser=new MxParser(new CommonTokenStream(lexer));

            lexer.removeErrorListeners();
            lexer.addErrorListener(new MxErrorListener());
            parser.removeErrorListeners();
            parser.addErrorListener(new MxErrorListener());

            ParseTree parseRoot= parser.program();

            ProgramNode rootNode;
            GlobalScope globalScope=new GlobalScope();

            ASTBuilder astBuilder=new ASTBuilder();
            rootNode= (ProgramNode) astBuilder.visit(parseRoot);
            new SemanticChecker(globalScope).visit(rootNode);
        }
        catch (Error error)
        {
            System.err.println(error.toString());
            throw new RuntimeException();
        }

    }
}

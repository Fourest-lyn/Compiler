import AST.ProgramNode;
import FrontEnd.ASTBuilder;
import FrontEnd.SemanticChecker;
import FrontEnd.SymbolCollector;
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
        boolean semanticCheckLocalFlag=false;
        String address="testcases/sema/builtin-func-package/builtin-4.mx";
        //consider: basic-68

        var input=System.in;
        if(semanticCheckLocalFlag)
        {
            System.out.println("Test address:"+address+"\n");
            input=new FileInputStream(address);
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
            new SymbolCollector(globalScope).visit(rootNode);
            new SemanticChecker(globalScope).visit(rootNode);
        }
        catch (Error error)
        {
            System.err.println(error.toString());
            throw new RuntimeException();
        }

    }
}

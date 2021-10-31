package FrontEnd;

import AST.ASTNode;
import AST.ASTVisitor;
import AST.DefineNode.*;
import AST.ExprNode.*;
import AST.ProgramNode;
import AST.StmtNode.*;
import AST.ToolNode.*;
import AST.TypeNode.ArrayType;
import AST.TypeNode.BaseType;
import AST.TypeNode.Type;
import AST.TypeNode.VoidType;
import Parser.MxBaseVisitor;
import Parser.MxParser;
import Util.Error.SyntaxError;
import Util.Position;
import Util.Scope.GlobalScope;
import Util.Scope.Scope;

import java.util.ArrayList;

public class ASTBuilder extends MxBaseVisitor<ASTNode>
{

    @Override public ASTNode visitProgram(MxParser.ProgramContext ctx)
    {
        ArrayList<ASTNode> defines=new ArrayList<>();
        for(var it:ctx.programBlock()) {defines.add(visit(it));}
        return new ProgramNode(new Position(ctx),defines);
    }

    @Override public ASTNode visitProgramBlock(MxParser.ProgramBlockContext ctx)
    {
        if(ctx.valueDefine()!=null) return visit(ctx.valueDefine());
        if(ctx.classDefine()!=null) return visit(ctx.classDefine());
        if(ctx.functionDefine()!=null) return visit(ctx.functionDefine());
        return null;
    }

    @Override public ASTNode visitBaseType(MxParser.BaseTypeContext ctx)
    {
        if(ctx.BOOL()!=null) return new BaseType(new Position(ctx),"bool");
        if(ctx.INT()!=null) return new BaseType(new Position(ctx),"int");
        if(ctx.STRING()!=null) return new BaseType(new Position(ctx),"string");
        return new BaseType(new Position(ctx),ctx.IDENTIFIER().getText());
    }

    @Override public ASTNode visitType(MxParser.TypeContext ctx)
    {
        return new ArrayType(new Position(ctx), (Type) visit(ctx.type()));
    }

    @Override public ASTNode visitValueDef(MxParser.ValueDefContext ctx)
    {
        return new SingleDefine(new Position(ctx), ctx.IDENTIFIER().getText(), (Expression) visit(ctx.expression()));
    }

    @Override public ASTNode visitValueDefine(MxParser.ValueDefineContext ctx)
    {
        ArrayList<SingleDefine> defines=new ArrayList<>();
        Type type=(Type) visit(ctx.type());
        for(var it:ctx.valueDef())
        {
            SingleDefine def=(SingleDefine) visit(it);
            def.type=type;
            defines.add(def);
        }
        return new ValueDefine(new Position(ctx),type,defines);
    }

    @Override public ASTNode visitValueList(MxParser.ValueListContext ctx)
    {
        ArrayList<Expression> expressions=new ArrayList<>();
        for(var it:ctx.expression()) expressions.add((Expression) visit(it));
        return new ValueList(new Position(ctx),expressions);
    }

    @Override public ASTNode visitObjectInitial(MxParser.ObjectInitialContext ctx)
    {
        return new ObjectInitial(new Position(ctx),(BaseType) visit(ctx.baseType()));
    }

    @Override public ASTNode visitArrayInitial(MxParser.ArrayInitialContext ctx)
    {
        BaseType baseType=(BaseType) visit(ctx.baseType());
        ArrayList<Expression> expressions=new ArrayList<>();
        for(var it: ctx.expression()) expressions.add((Expression) visit(it));
        int dimension=ctx.LEFTBRACKET().size();
        return new ArrayInitial(new Position(ctx),baseType,dimension,expressions);
    }

    @Override public ASTNode visitWrongInitial(MxParser.WrongInitialContext ctx)
    {
        throw new SyntaxError(new Position(ctx),"Unexpected grammar to initial array.");
    }

    @Override public ASTNode visitReturnType(MxParser.ReturnTypeContext ctx)
    {
        if(ctx.VOID()!=null) return new VoidType(new Position(ctx));
        return (ArrayType) visit(ctx.type());
    }

    @Override public ASTNode visitFunctionParameter(MxParser.FunctionParameterContext ctx)
    {
        ArrayList<ArrayType> types=new ArrayList<>();
        ArrayList<String> names=new ArrayList<>();
        for(var it:ctx.type()) types.add((ArrayType) visit(it));
        for(var it:ctx.IDENTIFIER()) names.add(it.getText());
        return new FunctionParameter(new Position(ctx),types,names);
    }

    @Override public ASTNode visitFunctionDefine(MxParser.FunctionDefineContext ctx)
    {
        Type returnType= (Type) visit(ctx.returnType());
        String funcName=ctx.IDENTIFIER().getText();
        FunctionParameter paras= (FunctionParameter) visit(ctx.functionParameter());
        BlockStatement suite= (BlockStatement) visit(ctx.suite());
        return new FunctionDefine(new Position(ctx),returnType,funcName,paras,suite);
    }

    @Override public ASTNode visitLambdaFunction(MxParser.LambdaFunctionContext ctx)
    {
        FunctionParameter paras= (FunctionParameter) visit(ctx.functionParameter());
        BlockStatement suite= (BlockStatement) visit(ctx.suite());
        ValueList valueList= (ValueList) visit(ctx.valueList());
        return new LambdaFunction(new Position(ctx),paras,suite,valueList);
    }

    @Override public ASTNode visitClassConstructor(MxParser.ClassConstructorContext ctx)
    {
        String name=ctx.IDENTIFIER().getText();
        BlockStatement suite= (BlockStatement) visit(ctx.suite());
        return new ConstructDefine(new Position(ctx),name,suite);
    }

    @Override public ASTNode visitClassDefine(MxParser.ClassDefineContext ctx)
    {
        String className=ctx.IDENTIFIER().getText();
        ArrayList<ValueDefine> values=new ArrayList<>();
        ArrayList<ConstructDefine> constructors=new ArrayList<>();
        ArrayList<FunctionDefine> functions=new ArrayList<>();
        for(var it: ctx.valueDefine()) values.add((ValueDefine) visit(it));
        for(var it: ctx.classConstructor()) constructors.add((ConstructDefine) visit(it));
        for(var it: ctx.functionDefine()) functions.add((FunctionDefine) visit(it));
        return new ClassDefine(new Position(ctx),className,values,constructors,functions);
    }

    @Override public ASTNode visitSuite(MxParser.SuiteContext ctx)
    {
        ArrayList<Statement> stmts=new ArrayList<>();
        for(var it: ctx.statement()) stmts.add((Statement) visit(it));
        return new BlockStatement(new Position(ctx),stmts);
    }

    @Override public ASTNode visitBlock(MxParser.BlockContext ctx)
    {
        return visit(ctx.suite());
    }

    @Override public ASTNode visitValueDefStmt(MxParser.ValueDefStmtContext ctx)
    {
        return visit(ctx.valueDefine());
    }

    @Override public ASTNode visitIfStmt(MxParser.IfStmtContext ctx)
    {
        Expression flag= (Expression) visit(ctx.expression());
        Statement trueStatement= (Statement) visit(ctx.trueStatement);
        Statement falseStatement=null;
        if(ctx.falseStatement!=null) falseStatement= (Statement) visit(ctx.falseStatement);
        return new IfStatement(new Position(ctx),flag,trueStatement,falseStatement);
    }

    @Override public ASTNode visitReturnStmt(MxParser.ReturnStmtContext ctx)
    {
        Expression returnValue=null;
        if(ctx.expression()!=null) returnValue=(Expression) visit(ctx.expression());
        return new ReturnStatement(new Position(ctx),returnValue);
    }

    @Override public ASTNode visitBreakStmt(MxParser.BreakStmtContext ctx)
    {
        return new BreakStatement(new Position(ctx));
    }

    @Override public ASTNode visitContinueStmt(MxParser.ContinueStmtContext ctx)
    {
        return new ContinueStatement(new Position(ctx));
    }

    @Override public ASTNode visitWhileStmt(MxParser.WhileStmtContext ctx)
    {
        Expression condition= (Expression) visit(ctx.expression());
        Statement stmt= (Statement) visit(ctx.statement());
        return new WhileStatement(new Position(ctx),condition,stmt);
    }

    @Override public ASTNode visitForStmt(MxParser.ForStmtContext ctx)
    {
        Expression init=null,condition=null,incr=null;
        if(ctx.init!=null) init= (Expression) visit(ctx.init);
        if(ctx.condition!=null) condition=(Expression) visit(ctx.condition);
        if(ctx.incr!=null) incr=(Expression) visit(ctx.incr);
        Statement stmt=(Statement) visit(ctx.statement());
        return new ForStatement(new Position(ctx),init,condition,incr,stmt);
    }

    @Override public ASTNode visitPureExprStmt(MxParser.PureExprStmtContext ctx)
    {
        return new ExprStatement(new Position(ctx), (Expression) visit(ctx.expression()));
    }

    @Override public ASTNode visitEmptyStmt(MxParser.EmptyStmtContext ctx)
    {
        return new EmptyStatement(new Position(ctx));
    }

    @Override public ASTNode visitNewExpr(MxParser.NewExprContext ctx)
    {
        return new NewExpression(new Position(ctx), (NewType) visit(ctx.newType()));
    }

    @Override public ASTNode visitIndexExpr(MxParser.IndexExprContext ctx)
    {
        Expression name= (Expression) visit(ctx.name);
        Expression index=(Expression) visit(ctx.index);
        return new IndexExpression(new Position(ctx),name,index);
    }

    @Override public ASTNode visitUnaryExpr(MxParser.UnaryExprContext ctx)
    {
        Expression rightExpr= (Expression) visit(ctx.expression());
        UnaryExpression.Operator op=null;
        if(ctx.NOT()!=null) op= UnaryExpression.Operator.LNOT;
        if(ctx.PLUS()!=null) op= UnaryExpression.Operator.POS;
        if(ctx.MINUS()!=null) op= UnaryExpression.Operator.NEG;
        if(ctx.TILDE()!=null) op= UnaryExpression.Operator.BITNOT;
        if(ctx.SELFMINUS()!=null) op= UnaryExpression.Operator.SELFDEC;
        if(ctx.SELFPLUS()!=null) op= UnaryExpression.Operator.SELFINC;
        return new UnaryExpression(new Position(ctx),op,rightExpr);
    }

    @Override public ASTNode visitLambdaExpr(MxParser.LambdaExprContext ctx)
    {
        return new LambdaExpression(new Position(ctx),(LambdaFunction) visit(ctx.lambdaFunction()));
    }

    @Override public ASTNode visitClassExpr(MxParser.ClassExprContext ctx)
    {
        if(ctx.THIS()!=null) return new ThisExpression(new Position(ctx));
        String className=ctx.id.getText();
        String methodName=ctx.func.getText();
        ValueList values=null;
        boolean functionFlag=(ctx.LEFTPAREN()!=null && ctx.RIGHTPAREN()!=null);
        if(functionFlag && ctx.valueList()!=null) values= (ValueList) visit(ctx.valueList());
        return new ClassExpression(new Position(ctx),className,methodName,values,functionFlag);
    }

    @Override public ASTNode visitAtomExpr(MxParser.AtomExprContext ctx)
    {
        return (Expression)visit(ctx.primary());
    }

    @Override public ASTNode visitIncrExpr(MxParser.IncrExprContext ctx)
    {
        Expression leftExpr=(Expression) visit(ctx.expression());
        IncrExpression.Operator op=null;
        if(ctx.SELFPLUS()!=null) op= IncrExpression.Operator.SELFINC;
        if(ctx.SELFMINUS()!=null) op= IncrExpression.Operator.SELFDEC;
        return new IncrExpression(new Position(ctx),op,leftExpr);
    }

    @Override public ASTNode visitBinaryExpr(MxParser.BinaryExprContext ctx)
    {
        Expression left= (Expression) visit(ctx.left);
        Expression right=(Expression) visit(ctx.right);
        BinaryExpression.Operator op=null;
        if(ctx.MUL()!=null) op= BinaryExpression.Operator.MUL;
        if(ctx.DIV()!=null) op= BinaryExpression.Operator.DIV;
        if(ctx.MOD()!=null) op= BinaryExpression.Operator.MOD;
        if(ctx.LEFTSHIFT()!=null) op= BinaryExpression.Operator.SHL;
        if(ctx.RIGHTSHIFT()!=null) op= BinaryExpression.Operator.SHR;
        if(ctx.GREATER()!=null) op= BinaryExpression.Operator.GRE;
        if(ctx.GREATEREQUAL()!=null) op= BinaryExpression.Operator.GEQ;
        if(ctx.LESS()!=null) op= BinaryExpression.Operator.LES;
        if(ctx.LESSEQUAL()!=null) op= BinaryExpression.Operator.LEQ;
        if(ctx.EQUAL()!=null) op= BinaryExpression.Operator.EQ;
        if(ctx.NOTEQUAL()!=null) op= BinaryExpression.Operator.NEQ;
        if(ctx.AND()!=null) op= BinaryExpression.Operator.AND;
        if(ctx.OR()!=null) op= BinaryExpression.Operator.OR;
        if(ctx.CARET()!=null) op= BinaryExpression.Operator.XOR;
        if(ctx.ANDAND()!=null) op= BinaryExpression.Operator.LAND;
        if(ctx.OROR()!=null) op= BinaryExpression.Operator.LOR;
        return new BinaryExpression(new Position(ctx),op,left,right);
    }

    @Override public ASTNode visitAssignExpr(MxParser.AssignExprContext ctx)
    {
        Expression left=(Expression) visit(ctx.left);
        Expression right=(Expression) visit(ctx.right);
        return new AssignExpression(new Position(ctx),left,right);
    }

    @Override public ASTNode visitFunctionExpr(MxParser.FunctionExprContext ctx)
    {
        String funcName=ctx.IDENTIFIER().getText();
        ValueList values= (ValueList) visit(ctx.valueList());
        return new FuncExpression(new Position(ctx),funcName,values);
    }

    @Override public ASTNode visitPrimary(MxParser.PrimaryContext ctx)
    {
        if(ctx.IDENTIFIER()!=null) return new IdExpression(new Position(ctx),ctx.IDENTIFIER().getText());
        if(ctx.literal()!=null) return visit(ctx.literal());
        return (Expression)visit(ctx.expression());
    }

    @Override public ASTNode visitLiteral(MxParser.LiteralContext ctx)
    {
        String kind=null;
        if(ctx.BOOLCONST()!=null) kind= "bool";
        if(ctx.NULLCONST()!=null) kind= "null";
        if(ctx.STRINGCONST()!=null) kind= "string";
        if(ctx.INTEGERCONST()!=null) kind= "int";
        return new ConstExpression(new Position(ctx),kind);
    }
}

























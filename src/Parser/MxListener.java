// Generated from D:/workspace/java/Compiler_Mx/src/Parser\Mx.g4 by ANTLR 4.9.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxParser}.
 */
public interface MxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#programBlock}.
	 * @param ctx the parse tree
	 */
	void enterProgramBlock(MxParser.ProgramBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#programBlock}.
	 * @param ctx the parse tree
	 */
	void exitProgramBlock(MxParser.ProgramBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(MxParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(MxParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#valueDef}.
	 * @param ctx the parse tree
	 */
	void enterValueDef(MxParser.ValueDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#valueDef}.
	 * @param ctx the parse tree
	 */
	void exitValueDef(MxParser.ValueDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#valueDefine}.
	 * @param ctx the parse tree
	 */
	void enterValueDefine(MxParser.ValueDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#valueDefine}.
	 * @param ctx the parse tree
	 */
	void exitValueDefine(MxParser.ValueDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(MxParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(MxParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectInitial}
	 * labeled alternative in {@link MxParser#newType}.
	 * @param ctx the parse tree
	 */
	void enterObjectInitial(MxParser.ObjectInitialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectInitial}
	 * labeled alternative in {@link MxParser#newType}.
	 * @param ctx the parse tree
	 */
	void exitObjectInitial(MxParser.ObjectInitialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInitial}
	 * labeled alternative in {@link MxParser#newType}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitial(MxParser.ArrayInitialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInitial}
	 * labeled alternative in {@link MxParser#newType}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitial(MxParser.ArrayInitialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wrongInitial}
	 * labeled alternative in {@link MxParser#newType}.
	 * @param ctx the parse tree
	 */
	void enterWrongInitial(MxParser.WrongInitialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wrongInitial}
	 * labeled alternative in {@link MxParser#newType}.
	 * @param ctx the parse tree
	 */
	void exitWrongInitial(MxParser.WrongInitialContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(MxParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(MxParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(MxParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(MxParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#functionDefine}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefine(MxParser.FunctionDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#functionDefine}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefine(MxParser.FunctionDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunction(MxParser.LambdaFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunction(MxParser.LambdaFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void enterClassConstructor(MxParser.ClassConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#classConstructor}.
	 * @param ctx the parse tree
	 */
	void exitClassConstructor(MxParser.ClassConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDefine(MxParser.ClassDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDefine(MxParser.ClassDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(MxParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(MxParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MxParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MxParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueDefStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterValueDefStmt(MxParser.ValueDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueDefStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitValueDefStmt(MxParser.ValueDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(MxParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(MxParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(MxParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(MxParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(MxParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(MxParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(MxParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(MxParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(MxParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(MxParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(MxParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(MxParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pureExprStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPureExprStmt(MxParser.PureExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pureExprStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPureExprStmt(MxParser.PureExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(MxParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(MxParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(MxParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(MxParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(MxParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(MxParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(MxParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(MxParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambdaExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(MxParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambdaExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(MxParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClassExpr(MxParser.ClassExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClassExpr(MxParser.ClassExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(MxParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(MxParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(MxParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(MxParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncrExpr(MxParser.IncrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncrExpr(MxParser.IncrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(MxParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(MxParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(MxParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(MxParser.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(MxParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(MxParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MxParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MxParser.LiteralContext ctx);
}
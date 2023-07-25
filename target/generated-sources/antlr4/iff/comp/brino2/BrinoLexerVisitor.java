// Generated from iff\comp\brino2\BrinoLexer.g4 by ANTLR 4.12.0
package iff.comp.brino2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BrinoLexerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BrinoLexerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(BrinoLexerParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#escopoExt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscopoExt(BrinoLexerParser.EscopoExtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(BrinoLexerParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#importpc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportpc(BrinoLexerParser.ImportpcContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#escopoLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscopoLoop(BrinoLexerParser.EscopoLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#escopoConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscopoConfig(BrinoLexerParser.EscopoConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(BrinoLexerParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(BrinoLexerParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#comandoModopino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoModopino(BrinoLexerParser.ComandoModopinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#comandoRepetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRepetir(BrinoLexerParser.ComandoRepetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#comandoLerDigital}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoLerDigital(BrinoLexerParser.ComandoLerDigitalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#comandoLerAnalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoLerAnalog(BrinoLexerParser.ComandoLerAnalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#comandoEscreverAnalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEscreverAnalog(BrinoLexerParser.ComandoEscreverAnalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#comandoLigar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoLigar(BrinoLexerParser.ComandoLigarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#comandoDesligar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoDesligar(BrinoLexerParser.ComandoDesligarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#comandoEsperar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEsperar(BrinoLexerParser.ComandoEsperarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BrinoLexerParser#variavelouliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelouliteral(BrinoLexerParser.VariavelouliteralContext ctx);
}
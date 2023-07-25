// Generated from iff\comp\brino2\BrinoLexer.g4 by ANTLR 4.12.0
package iff.comp.brino2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BrinoLexerParser}.
 */
public interface BrinoLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(BrinoLexerParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(BrinoLexerParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#escopoExt}.
	 * @param ctx the parse tree
	 */
	void enterEscopoExt(BrinoLexerParser.EscopoExtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#escopoExt}.
	 * @param ctx the parse tree
	 */
	void exitEscopoExt(BrinoLexerParser.EscopoExtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(BrinoLexerParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(BrinoLexerParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#importpc}.
	 * @param ctx the parse tree
	 */
	void enterImportpc(BrinoLexerParser.ImportpcContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#importpc}.
	 * @param ctx the parse tree
	 */
	void exitImportpc(BrinoLexerParser.ImportpcContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#escopoLoop}.
	 * @param ctx the parse tree
	 */
	void enterEscopoLoop(BrinoLexerParser.EscopoLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#escopoLoop}.
	 * @param ctx the parse tree
	 */
	void exitEscopoLoop(BrinoLexerParser.EscopoLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#escopoConfig}.
	 * @param ctx the parse tree
	 */
	void enterEscopoConfig(BrinoLexerParser.EscopoConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#escopoConfig}.
	 * @param ctx the parse tree
	 */
	void exitEscopoConfig(BrinoLexerParser.EscopoConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(BrinoLexerParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(BrinoLexerParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(BrinoLexerParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(BrinoLexerParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#comandoModopino}.
	 * @param ctx the parse tree
	 */
	void enterComandoModopino(BrinoLexerParser.ComandoModopinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#comandoModopino}.
	 * @param ctx the parse tree
	 */
	void exitComandoModopino(BrinoLexerParser.ComandoModopinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#comandoRepetir}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepetir(BrinoLexerParser.ComandoRepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#comandoRepetir}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepetir(BrinoLexerParser.ComandoRepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#comandoLerDigital}.
	 * @param ctx the parse tree
	 */
	void enterComandoLerDigital(BrinoLexerParser.ComandoLerDigitalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#comandoLerDigital}.
	 * @param ctx the parse tree
	 */
	void exitComandoLerDigital(BrinoLexerParser.ComandoLerDigitalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#comandoLerAnalog}.
	 * @param ctx the parse tree
	 */
	void enterComandoLerAnalog(BrinoLexerParser.ComandoLerAnalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#comandoLerAnalog}.
	 * @param ctx the parse tree
	 */
	void exitComandoLerAnalog(BrinoLexerParser.ComandoLerAnalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#comandoEscreverAnalog}.
	 * @param ctx the parse tree
	 */
	void enterComandoEscreverAnalog(BrinoLexerParser.ComandoEscreverAnalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#comandoEscreverAnalog}.
	 * @param ctx the parse tree
	 */
	void exitComandoEscreverAnalog(BrinoLexerParser.ComandoEscreverAnalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#comandoLigar}.
	 * @param ctx the parse tree
	 */
	void enterComandoLigar(BrinoLexerParser.ComandoLigarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#comandoLigar}.
	 * @param ctx the parse tree
	 */
	void exitComandoLigar(BrinoLexerParser.ComandoLigarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#comandoDesligar}.
	 * @param ctx the parse tree
	 */
	void enterComandoDesligar(BrinoLexerParser.ComandoDesligarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#comandoDesligar}.
	 * @param ctx the parse tree
	 */
	void exitComandoDesligar(BrinoLexerParser.ComandoDesligarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#comandoEsperar}.
	 * @param ctx the parse tree
	 */
	void enterComandoEsperar(BrinoLexerParser.ComandoEsperarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#comandoEsperar}.
	 * @param ctx the parse tree
	 */
	void exitComandoEsperar(BrinoLexerParser.ComandoEsperarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrinoLexerParser#variavelouliteral}.
	 * @param ctx the parse tree
	 */
	void enterVariavelouliteral(BrinoLexerParser.VariavelouliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrinoLexerParser#variavelouliteral}.
	 * @param ctx the parse tree
	 */
	void exitVariavelouliteral(BrinoLexerParser.VariavelouliteralContext ctx);
}
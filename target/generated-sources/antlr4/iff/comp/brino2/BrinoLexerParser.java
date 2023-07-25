// Generated from iff\comp\brino2\BrinoLexer.g4 by ANTLR 4.12.0
package iff.comp.brino2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BrinoLexerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PORTA=1, IMPORTAR=2, MODOPINO=3, REPETIR=4, LERANALOG=5, ESCREVERANALOG=6, 
		LERDIGITAL=7, LIGAR=8, DESLIGAR=9, ESPERAR=10, CONFIG=11, LOOP=12, MODO=13, 
		SAIDA=14, ENTRADA=15, LITERAL=16, NUMINT=17, NUMREAL=18, CADEIA=19, LITERAL_BINARIO=20, 
		TIPO_VAR=21, INTEIRO=22, REAL=23, BINARIO=24, TEXTO=25, OP_BOOL=26, OP_REL=27, 
		OP_ARIT=28, OP_ARIT2=29, VARIAVEL=30, VIRGULA=31, ATRIB=32, ABREPAR=33, 
		FECHAPAR=34, ABRECHAVE=35, FECHACHAVE=36, COMENTARIO=37, EB=38;
	public static final int
		RULE_programa = 0, RULE_escopoExt = 1, RULE_define = 2, RULE_importpc = 3, 
		RULE_escopoLoop = 4, RULE_escopoConfig = 5, RULE_declaracao = 6, RULE_comando = 7, 
		RULE_comandoModopino = 8, RULE_comandoRepetir = 9, RULE_comandoLerDigital = 10, 
		RULE_comandoLerAnalog = 11, RULE_comandoEscreverAnalog = 12, RULE_comandoLigar = 13, 
		RULE_comandoDesligar = 14, RULE_comandoEsperar = 15, RULE_variavelouliteral = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "escopoExt", "define", "importpc", "escopoLoop", "escopoConfig", 
			"declaracao", "comando", "comandoModopino", "comandoRepetir", "comandoLerDigital", 
			"comandoLerAnalog", "comandoEscreverAnalog", "comandoLigar", "comandoDesligar", 
			"comandoEsperar", "variavelouliteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'porta'", "'importar'", "'modoPino'", "'repetir'", "'lerAnalog'", 
			"'escreverAnalog'", "'lerDigital'", "'ligar'", "'desligar'", "'esperar'", 
			"'config'", "'loop'", null, "'saida'", "'entrada'", null, null, null, 
			null, null, null, "'inteiro'", "'real'", "'binario'", "'texto'", null, 
			null, null, null, null, "','", "'='", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PORTA", "IMPORTAR", "MODOPINO", "REPETIR", "LERANALOG", "ESCREVERANALOG", 
			"LERDIGITAL", "LIGAR", "DESLIGAR", "ESPERAR", "CONFIG", "LOOP", "MODO", 
			"SAIDA", "ENTRADA", "LITERAL", "NUMINT", "NUMREAL", "CADEIA", "LITERAL_BINARIO", 
			"TIPO_VAR", "INTEIRO", "REAL", "BINARIO", "TEXTO", "OP_BOOL", "OP_REL", 
			"OP_ARIT", "OP_ARIT2", "VARIAVEL", "VIRGULA", "ATRIB", "ABREPAR", "FECHAPAR", 
			"ABRECHAVE", "FECHACHAVE", "COMENTARIO", "EB"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BrinoLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BrinoLexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public EscopoExtContext escopoExt() {
			return getRuleContext(EscopoExtContext.class,0);
		}
		public TerminalNode CONFIG() { return getToken(BrinoLexerParser.CONFIG, 0); }
		public List<TerminalNode> ABRECHAVE() { return getTokens(BrinoLexerParser.ABRECHAVE); }
		public TerminalNode ABRECHAVE(int i) {
			return getToken(BrinoLexerParser.ABRECHAVE, i);
		}
		public EscopoConfigContext escopoConfig() {
			return getRuleContext(EscopoConfigContext.class,0);
		}
		public List<TerminalNode> FECHACHAVE() { return getTokens(BrinoLexerParser.FECHACHAVE); }
		public TerminalNode FECHACHAVE(int i) {
			return getToken(BrinoLexerParser.FECHACHAVE, i);
		}
		public TerminalNode LOOP() { return getToken(BrinoLexerParser.LOOP, 0); }
		public EscopoLoopContext escopoLoop() {
			return getRuleContext(EscopoLoopContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BrinoLexerParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			escopoExt();
			setState(35);
			match(CONFIG);
			setState(36);
			match(ABRECHAVE);
			setState(37);
			escopoConfig();
			setState(38);
			match(FECHACHAVE);
			setState(39);
			match(LOOP);
			setState(40);
			match(ABRECHAVE);
			setState(41);
			escopoLoop();
			setState(42);
			match(FECHACHAVE);
			setState(43);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscopoExtContext extends ParserRuleContext {
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public List<ImportpcContext> importpc() {
			return getRuleContexts(ImportpcContext.class);
		}
		public ImportpcContext importpc(int i) {
			return getRuleContext(ImportpcContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public EscopoExtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopoExt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterEscopoExt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitEscopoExt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitEscopoExt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscopoExtContext escopoExt() throws RecognitionException {
		EscopoExtContext _localctx = new EscopoExtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_escopoExt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1075840860L) != 0)) {
				{
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(45);
					define();
					}
					break;
				case 2:
					{
					setState(46);
					importpc();
					}
					break;
				case 3:
					{
					setState(47);
					comando();
					}
					break;
				case 4:
					{
					setState(48);
					declaracao();
					}
					break;
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefineContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(BrinoLexerParser.VARIAVEL, 0); }
		public TerminalNode PORTA() { return getToken(BrinoLexerParser.PORTA, 0); }
		public VariavelouliteralContext variavelouliteral() {
			return getRuleContext(VariavelouliteralContext.class,0);
		}
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(VARIAVEL);
			setState(55);
			match(PORTA);
			setState(56);
			variavelouliteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportpcContext extends ParserRuleContext {
		public TerminalNode IMPORTAR() { return getToken(BrinoLexerParser.IMPORTAR, 0); }
		public TerminalNode VARIAVEL() { return getToken(BrinoLexerParser.VARIAVEL, 0); }
		public ImportpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importpc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterImportpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitImportpc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitImportpc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportpcContext importpc() throws RecognitionException {
		ImportpcContext _localctx = new ImportpcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importpc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IMPORTAR);
			setState(59);
			match(VARIAVEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscopoLoopContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public EscopoLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopoLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterEscopoLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitEscopoLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitEscopoLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscopoLoopContext escopoLoop() throws RecognitionException {
		EscopoLoopContext _localctx = new EscopoLoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_escopoLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1075840856L) != 0)) {
				{
				setState(63);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODOPINO:
				case REPETIR:
				case ESCREVERANALOG:
				case LIGAR:
				case DESLIGAR:
				case ESPERAR:
				case VARIAVEL:
					{
					setState(61);
					comando();
					}
					break;
				case TIPO_VAR:
					{
					setState(62);
					declaracao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscopoConfigContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public EscopoConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escopoConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterEscopoConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitEscopoConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitEscopoConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscopoConfigContext escopoConfig() throws RecognitionException {
		EscopoConfigContext _localctx = new EscopoConfigContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_escopoConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1075840856L) != 0)) {
				{
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODOPINO:
				case REPETIR:
				case ESCREVERANALOG:
				case LIGAR:
				case DESLIGAR:
				case ESPERAR:
				case VARIAVEL:
					{
					setState(68);
					comando();
					}
					break;
				case TIPO_VAR:
					{
					setState(69);
					declaracao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode TIPO_VAR() { return getToken(BrinoLexerParser.TIPO_VAR, 0); }
		public TerminalNode VARIAVEL() { return getToken(BrinoLexerParser.VARIAVEL, 0); }
		public TerminalNode ATRIB() { return getToken(BrinoLexerParser.ATRIB, 0); }
		public TerminalNode LITERAL() { return getToken(BrinoLexerParser.LITERAL, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(TIPO_VAR);
			setState(76);
			match(VARIAVEL);
			setState(77);
			match(ATRIB);
			setState(78);
			match(LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public ComandoModopinoContext comandoModopino() {
			return getRuleContext(ComandoModopinoContext.class,0);
		}
		public ComandoRepetirContext comandoRepetir() {
			return getRuleContext(ComandoRepetirContext.class,0);
		}
		public ComandoLerAnalogContext comandoLerAnalog() {
			return getRuleContext(ComandoLerAnalogContext.class,0);
		}
		public ComandoEscreverAnalogContext comandoEscreverAnalog() {
			return getRuleContext(ComandoEscreverAnalogContext.class,0);
		}
		public ComandoLerDigitalContext comandoLerDigital() {
			return getRuleContext(ComandoLerDigitalContext.class,0);
		}
		public ComandoLigarContext comandoLigar() {
			return getRuleContext(ComandoLigarContext.class,0);
		}
		public ComandoDesligarContext comandoDesligar() {
			return getRuleContext(ComandoDesligarContext.class,0);
		}
		public ComandoEsperarContext comandoEsperar() {
			return getRuleContext(ComandoEsperarContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comando);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				comandoModopino();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				comandoRepetir();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				comandoLerAnalog();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				comandoEscreverAnalog();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				comandoLerDigital();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				comandoLigar();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				comandoDesligar();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				comandoEsperar();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoModopinoContext extends ParserRuleContext {
		public TerminalNode MODOPINO() { return getToken(BrinoLexerParser.MODOPINO, 0); }
		public TerminalNode ABREPAR() { return getToken(BrinoLexerParser.ABREPAR, 0); }
		public VariavelouliteralContext variavelouliteral() {
			return getRuleContext(VariavelouliteralContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(BrinoLexerParser.VIRGULA, 0); }
		public TerminalNode MODO() { return getToken(BrinoLexerParser.MODO, 0); }
		public TerminalNode FECHAPAR() { return getToken(BrinoLexerParser.FECHAPAR, 0); }
		public ComandoModopinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoModopino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterComandoModopino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitComandoModopino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitComandoModopino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoModopinoContext comandoModopino() throws RecognitionException {
		ComandoModopinoContext _localctx = new ComandoModopinoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comandoModopino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(MODOPINO);
			setState(91);
			match(ABREPAR);
			setState(92);
			variavelouliteral();
			setState(93);
			match(VIRGULA);
			setState(94);
			match(MODO);
			setState(95);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoRepetirContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(BrinoLexerParser.REPETIR, 0); }
		public TerminalNode ABREPAR() { return getToken(BrinoLexerParser.ABREPAR, 0); }
		public VariavelouliteralContext variavelouliteral() {
			return getRuleContext(VariavelouliteralContext.class,0);
		}
		public TerminalNode FECHAPAR() { return getToken(BrinoLexerParser.FECHAPAR, 0); }
		public TerminalNode ABRECHAVE() { return getToken(BrinoLexerParser.ABRECHAVE, 0); }
		public TerminalNode FECHACHAVE() { return getToken(BrinoLexerParser.FECHACHAVE, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoRepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRepetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterComandoRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitComandoRepetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitComandoRepetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoRepetirContext comandoRepetir() throws RecognitionException {
		ComandoRepetirContext _localctx = new ComandoRepetirContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comandoRepetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(REPETIR);
			setState(98);
			match(ABREPAR);
			setState(99);
			variavelouliteral();
			setState(100);
			match(FECHAPAR);
			setState(101);
			match(ABRECHAVE);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073743704L) != 0)) {
				{
				{
				setState(102);
				comando();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(FECHACHAVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoLerDigitalContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(BrinoLexerParser.VARIAVEL, 0); }
		public TerminalNode ATRIB() { return getToken(BrinoLexerParser.ATRIB, 0); }
		public TerminalNode LERDIGITAL() { return getToken(BrinoLexerParser.LERDIGITAL, 0); }
		public TerminalNode ABREPAR() { return getToken(BrinoLexerParser.ABREPAR, 0); }
		public VariavelouliteralContext variavelouliteral() {
			return getRuleContext(VariavelouliteralContext.class,0);
		}
		public TerminalNode FECHAPAR() { return getToken(BrinoLexerParser.FECHAPAR, 0); }
		public ComandoLerDigitalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoLerDigital; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterComandoLerDigital(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitComandoLerDigital(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitComandoLerDigital(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoLerDigitalContext comandoLerDigital() throws RecognitionException {
		ComandoLerDigitalContext _localctx = new ComandoLerDigitalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandoLerDigital);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(VARIAVEL);
			setState(111);
			match(ATRIB);
			setState(112);
			match(LERDIGITAL);
			setState(113);
			match(ABREPAR);
			setState(114);
			variavelouliteral();
			setState(115);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoLerAnalogContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(BrinoLexerParser.VARIAVEL, 0); }
		public TerminalNode ATRIB() { return getToken(BrinoLexerParser.ATRIB, 0); }
		public TerminalNode LERANALOG() { return getToken(BrinoLexerParser.LERANALOG, 0); }
		public TerminalNode ABREPAR() { return getToken(BrinoLexerParser.ABREPAR, 0); }
		public VariavelouliteralContext variavelouliteral() {
			return getRuleContext(VariavelouliteralContext.class,0);
		}
		public TerminalNode FECHAPAR() { return getToken(BrinoLexerParser.FECHAPAR, 0); }
		public ComandoLerAnalogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoLerAnalog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterComandoLerAnalog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitComandoLerAnalog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitComandoLerAnalog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoLerAnalogContext comandoLerAnalog() throws RecognitionException {
		ComandoLerAnalogContext _localctx = new ComandoLerAnalogContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comandoLerAnalog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(VARIAVEL);
			setState(118);
			match(ATRIB);
			setState(119);
			match(LERANALOG);
			setState(120);
			match(ABREPAR);
			setState(121);
			variavelouliteral();
			setState(122);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoEscreverAnalogContext extends ParserRuleContext {
		public TerminalNode ESCREVERANALOG() { return getToken(BrinoLexerParser.ESCREVERANALOG, 0); }
		public TerminalNode ABREPAR() { return getToken(BrinoLexerParser.ABREPAR, 0); }
		public VariavelouliteralContext variavelouliteral() {
			return getRuleContext(VariavelouliteralContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(BrinoLexerParser.VIRGULA, 0); }
		public TerminalNode LITERAL() { return getToken(BrinoLexerParser.LITERAL, 0); }
		public TerminalNode FECHAPAR() { return getToken(BrinoLexerParser.FECHAPAR, 0); }
		public ComandoEscreverAnalogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEscreverAnalog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterComandoEscreverAnalog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitComandoEscreverAnalog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitComandoEscreverAnalog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoEscreverAnalogContext comandoEscreverAnalog() throws RecognitionException {
		ComandoEscreverAnalogContext _localctx = new ComandoEscreverAnalogContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comandoEscreverAnalog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ESCREVERANALOG);
			setState(125);
			match(ABREPAR);
			setState(126);
			variavelouliteral();
			setState(127);
			match(VIRGULA);
			setState(128);
			match(LITERAL);
			setState(129);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoLigarContext extends ParserRuleContext {
		public TerminalNode LIGAR() { return getToken(BrinoLexerParser.LIGAR, 0); }
		public TerminalNode ABREPAR() { return getToken(BrinoLexerParser.ABREPAR, 0); }
		public TerminalNode FECHAPAR() { return getToken(BrinoLexerParser.FECHAPAR, 0); }
		public VariavelouliteralContext variavelouliteral() {
			return getRuleContext(VariavelouliteralContext.class,0);
		}
		public ComandoLigarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoLigar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterComandoLigar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitComandoLigar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitComandoLigar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoLigarContext comandoLigar() throws RecognitionException {
		ComandoLigarContext _localctx = new ComandoLigarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandoLigar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(LIGAR);
			setState(132);
			match(ABREPAR);
			{
			setState(133);
			variavelouliteral();
			}
			setState(134);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoDesligarContext extends ParserRuleContext {
		public TerminalNode DESLIGAR() { return getToken(BrinoLexerParser.DESLIGAR, 0); }
		public TerminalNode ABREPAR() { return getToken(BrinoLexerParser.ABREPAR, 0); }
		public TerminalNode FECHAPAR() { return getToken(BrinoLexerParser.FECHAPAR, 0); }
		public VariavelouliteralContext variavelouliteral() {
			return getRuleContext(VariavelouliteralContext.class,0);
		}
		public ComandoDesligarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoDesligar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterComandoDesligar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitComandoDesligar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitComandoDesligar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoDesligarContext comandoDesligar() throws RecognitionException {
		ComandoDesligarContext _localctx = new ComandoDesligarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comandoDesligar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(DESLIGAR);
			setState(137);
			match(ABREPAR);
			{
			setState(138);
			variavelouliteral();
			}
			setState(139);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoEsperarContext extends ParserRuleContext {
		public TerminalNode ESPERAR() { return getToken(BrinoLexerParser.ESPERAR, 0); }
		public TerminalNode ABREPAR() { return getToken(BrinoLexerParser.ABREPAR, 0); }
		public TerminalNode FECHAPAR() { return getToken(BrinoLexerParser.FECHAPAR, 0); }
		public VariavelouliteralContext variavelouliteral() {
			return getRuleContext(VariavelouliteralContext.class,0);
		}
		public ComandoEsperarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEsperar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterComandoEsperar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitComandoEsperar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitComandoEsperar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoEsperarContext comandoEsperar() throws RecognitionException {
		ComandoEsperarContext _localctx = new ComandoEsperarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comandoEsperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ESPERAR);
			setState(142);
			match(ABREPAR);
			{
			setState(143);
			variavelouliteral();
			}
			setState(144);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelouliteralContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(BrinoLexerParser.VARIAVEL, 0); }
		public TerminalNode LITERAL() { return getToken(BrinoLexerParser.LITERAL, 0); }
		public VariavelouliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavelouliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).enterVariavelouliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrinoLexerListener ) ((BrinoLexerListener)listener).exitVariavelouliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrinoLexerVisitor ) return ((BrinoLexerVisitor<? extends T>)visitor).visitVariavelouliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelouliteralContext variavelouliteral() throws RecognitionException {
		VariavelouliteralContext _localctx = new VariavelouliteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variavelouliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==LITERAL || _la==VARIAVEL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u0095\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"2\b\u0001\n\u0001\f\u00015\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0005\u0004@\b\u0004\n\u0004\f\u0004C\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0005\u0005G\b\u0005\n\u0005\f\u0005J\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"Y\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\th\b\t\n\t\f\tk\t\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \u0000\u0001\u0002\u0000\u0010\u0010\u001e\u001e\u0093\u0000\"\u0001"+
		"\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000"+
		"\u0000\u0006:\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000\nH\u0001"+
		"\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000\u000eX\u0001\u0000\u0000"+
		"\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012a\u0001\u0000\u0000\u0000\u0014"+
		"n\u0001\u0000\u0000\u0000\u0016u\u0001\u0000\u0000\u0000\u0018|\u0001"+
		"\u0000\u0000\u0000\u001a\u0083\u0001\u0000\u0000\u0000\u001c\u0088\u0001"+
		"\u0000\u0000\u0000\u001e\u008d\u0001\u0000\u0000\u0000 \u0092\u0001\u0000"+
		"\u0000\u0000\"#\u0003\u0002\u0001\u0000#$\u0005\u000b\u0000\u0000$%\u0005"+
		"#\u0000\u0000%&\u0003\n\u0005\u0000&\'\u0005$\u0000\u0000\'(\u0005\f\u0000"+
		"\u0000()\u0005#\u0000\u0000)*\u0003\b\u0004\u0000*+\u0005$\u0000\u0000"+
		"+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000\u0000\u0000-2\u0003\u0004"+
		"\u0002\u0000.2\u0003\u0006\u0003\u0000/2\u0003\u000e\u0007\u000002\u0003"+
		"\f\u0006\u00001-\u0001\u0000\u0000\u00001.\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u0000"+
		"31\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004\u0003\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000067\u0005\u001e\u0000\u000078\u0005"+
		"\u0001\u0000\u000089\u0003 \u0010\u00009\u0005\u0001\u0000\u0000\u0000"+
		":;\u0005\u0002\u0000\u0000;<\u0005\u001e\u0000\u0000<\u0007\u0001\u0000"+
		"\u0000\u0000=@\u0003\u000e\u0007\u0000>@\u0003\f\u0006\u0000?=\u0001\u0000"+
		"\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\t\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000DG\u0003\u000e\u0007\u0000EG\u0003\f\u0006\u0000"+
		"FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u000b\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KL\u0005\u0015\u0000\u0000"+
		"LM\u0005\u001e\u0000\u0000MN\u0005 \u0000\u0000NO\u0005\u0010\u0000\u0000"+
		"O\r\u0001\u0000\u0000\u0000PY\u0003\u0010\b\u0000QY\u0003\u0012\t\u0000"+
		"RY\u0003\u0016\u000b\u0000SY\u0003\u0018\f\u0000TY\u0003\u0014\n\u0000"+
		"UY\u0003\u001a\r\u0000VY\u0003\u001c\u000e\u0000WY\u0003\u001e\u000f\u0000"+
		"XP\u0001\u0000\u0000\u0000XQ\u0001\u0000\u0000\u0000XR\u0001\u0000\u0000"+
		"\u0000XS\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000XU\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u000f"+
		"\u0001\u0000\u0000\u0000Z[\u0005\u0003\u0000\u0000[\\\u0005!\u0000\u0000"+
		"\\]\u0003 \u0010\u0000]^\u0005\u001f\u0000\u0000^_\u0005\r\u0000\u0000"+
		"_`\u0005\"\u0000\u0000`\u0011\u0001\u0000\u0000\u0000ab\u0005\u0004\u0000"+
		"\u0000bc\u0005!\u0000\u0000cd\u0003 \u0010\u0000de\u0005\"\u0000\u0000"+
		"ei\u0005#\u0000\u0000fh\u0003\u000e\u0007\u0000gf\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005$\u0000"+
		"\u0000m\u0013\u0001\u0000\u0000\u0000no\u0005\u001e\u0000\u0000op\u0005"+
		" \u0000\u0000pq\u0005\u0007\u0000\u0000qr\u0005!\u0000\u0000rs\u0003 "+
		"\u0010\u0000st\u0005\"\u0000\u0000t\u0015\u0001\u0000\u0000\u0000uv\u0005"+
		"\u001e\u0000\u0000vw\u0005 \u0000\u0000wx\u0005\u0005\u0000\u0000xy\u0005"+
		"!\u0000\u0000yz\u0003 \u0010\u0000z{\u0005\"\u0000\u0000{\u0017\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0006\u0000\u0000}~\u0005!\u0000\u0000~\u007f"+
		"\u0003 \u0010\u0000\u007f\u0080\u0005\u001f\u0000\u0000\u0080\u0081\u0005"+
		"\u0010\u0000\u0000\u0081\u0082\u0005\"\u0000\u0000\u0082\u0019\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005\b\u0000\u0000\u0084\u0085\u0005!\u0000"+
		"\u0000\u0085\u0086\u0003 \u0010\u0000\u0086\u0087\u0005\"\u0000\u0000"+
		"\u0087\u001b\u0001\u0000\u0000\u0000\u0088\u0089\u0005\t\u0000\u0000\u0089"+
		"\u008a\u0005!\u0000\u0000\u008a\u008b\u0003 \u0010\u0000\u008b\u008c\u0005"+
		"\"\u0000\u0000\u008c\u001d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\n"+
		"\u0000\u0000\u008e\u008f\u0005!\u0000\u0000\u008f\u0090\u0003 \u0010\u0000"+
		"\u0090\u0091\u0005\"\u0000\u0000\u0091\u001f\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0007\u0000\u0000\u0000\u0093!\u0001\u0000\u0000\u0000\b13?AFH"+
		"Xi";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
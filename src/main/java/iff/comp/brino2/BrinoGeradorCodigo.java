package iff.comp.brino2;

public class BrinoGeradorCodigo extends BrinoLexerBaseVisitor<Void> {
    private final StringBuilder codigo;
    
    public BrinoGeradorCodigo() {
        this.codigo = new StringBuilder();
    }
    
    
    @Override
    public Void visitPrograma(BrinoLexerParser.ProgramaContext ctx) {
        // Gerar a estrutura básica do programa com as funções setup() e loop()
        visitChildren(ctx.escopoExt());
        codigo.append("void setup() {\n");
        visitChildren(ctx.escopoConfig());
        codigo.append("}\n\n");
        codigo.append("void loop() {\n");
        visitChildren(ctx.escopoLoop());
        codigo.append("}\n");
        return null;
    }

    @Override
    public Void visitDeclaracao(BrinoLexerParser.DeclaracaoContext ctx) {
        String tipo = ctx.TIPO_VAR().getText();
        String variavel = ctx.VARIAVEL().getText();
        String valor = ctx.LITERAL().getText();

        // Verifica se o tipo é 'inteiro' e substitui por 'int' no código gerado
        if (tipo.equals("inteiro")) {
            tipo = "int";
        }
        if (tipo.equals("real")) {
            tipo = "float";
        }
        if (tipo.equals("binario")) {
            tipo = "bool";
        }
        if (tipo.equals("texto")) {
            tipo = "String";
        }

        codigo.append(tipo).append(" ").append(variavel).append(" = ").append(valor).append(";\n");
        return null;
    }


    @Override
    public Void visitComando(BrinoLexerParser.ComandoContext ctx) {
        return visitChildren(ctx);
    }
    
    @Override
    public Void visitComandoRepetir(BrinoLexerParser.ComandoRepetirContext ctx) {
        String numRepeticoes = ctx.variavelouliteral().getText();
        
        codigo.append("for (int i = 0; i < ").append(numRepeticoes).append("; i++) {\n");
        visitChildren(ctx);
        codigo.append("}\n");

        return null;
    }

    @Override
    public Void visitComandoLigar(BrinoLexerParser.ComandoLigarContext ctx) {
        String pino = ctx.variavelouliteral().getText();
        codigo.append("digitalWrite(").append(pino).append(", HIGH);\n");
        return null;
    }

    @Override
    public Void visitComandoDesligar(BrinoLexerParser.ComandoDesligarContext ctx) {
        String pino = ctx.variavelouliteral().getText();
        codigo.append("digitalWrite(").append(pino).append(", LOW);\n");
        return null;
    }
    
    @Override
    public Void visitComandoEsperar(BrinoLexerParser.ComandoEsperarContext ctx) {
        String tempo = ctx.variavelouliteral().getText();
        codigo.append("delay(").append(tempo).append(");\n");
        return null;
    }
    
    @Override
    public Void visitDefine(BrinoLexerParser.DefineContext ctx) {
        String identifier = ctx.VARIAVEL().getText();
        String value = ctx.variavelouliteral().getText();
        codigo.append("#define ").append(identifier).append(" ").append(value).append("\n");
        return null;
    }
    
    @Override
    public Void visitComandoLerDigital(BrinoLexerParser.ComandoLerDigitalContext ctx) {
        String variavel = ctx.VARIAVEL().getText();
        String pino = ctx.variavelouliteral().getText();

        codigo.append(variavel).append(" = digitalRead(").append(pino).append(");\n");
        return null;
    }

    @Override
    public Void visitComandoEscreverAnalog(BrinoLexerParser.ComandoEscreverAnalogContext ctx) {
        String pino = ctx.variavelouliteral().getText();
        String valor = ctx.LITERAL().getText();

        codigo.append("analogWrite(").append(pino).append(", ").append(valor).append(");\n");
        return null;
    }

    @Override
    public Void visitComandoLerAnalog(BrinoLexerParser.ComandoLerAnalogContext ctx) {
        String variavel = ctx.VARIAVEL().getText();
        String pino = ctx.variavelouliteral().getText();

        codigo.append(variavel).append(" = analogRead(").append(pino).append(");\n");
        return null;
    }
    
    @Override
    public Void visitImportpc(BrinoLexerParser.ImportpcContext ctx) {
        String nomeBiblioteca = ctx.VARIAVEL().getText();
        codigo.append("#include <").append(nomeBiblioteca).append(".h>").append("\n");
        return null;
    }
    
    @Override
    public Void visitComandoModopino(BrinoLexerParser.ComandoModopinoContext ctx) {
        String pino = ctx.variavelouliteral().getText();
        String modo = ctx.MODO().getText();

        if (modo.equals("saida")) {
            modo = "OUTPUT";
        } else if (modo.equals("entrada")) {
            modo = "INPUT";
        }

        codigo.append("pinMode(").append(pino).append(", ").append(modo).append(");\n");
        return null;
    }

    public String getCodigo() {
        return codigo.toString();
    }
}

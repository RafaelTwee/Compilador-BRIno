package iff.comp.brino2;

import iff.comp.brino2.BrinoLexerParser.ProgramaContext;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Brino2 {
    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        BrinoLexerLexer lexer = new BrinoLexerLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BrinoLexerParser parser = new BrinoLexerParser(tokens);
        ProgramaContext arvore = parser.programa();
        
        BrinoGeradorCodigo agc = new BrinoGeradorCodigo();
            agc.visitPrograma(arvore);
            try(PrintWriter pw = new PrintWriter(args[1])) {
                pw.print(agc.getCodigo());
            }
    }
}

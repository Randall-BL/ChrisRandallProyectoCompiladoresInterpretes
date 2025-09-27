package com.miorganizacion.vgraph.frontend;

import org.antlr.v4.runtime.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.miorganizacion.vgraph.frontend.ast.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String run(String filePath) {
        StringBuilder errors = new StringBuilder();

        try {
            ANTLRFileStream input = new ANTLRFileStream(filePath);
            VGraphLexer lexer = new VGraphLexer(input);
            CollectingErrorListener lexerErrors = new CollectingErrorListener();
            lexer.removeErrorListeners();
            lexer.addErrorListener(lexerErrors);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            VGraphParser parser = new VGraphParser(tokens);
            CollectingErrorListener parserErrors = new CollectingErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(parserErrors);

            VGraphParser.StartContext tree = parser.start();

            if (!lexerErrors.getErrors().isEmpty() || !parserErrors.getErrors().isEmpty()) {
                for (String err : lexerErrors.getErrors()) errors.append(err).append("\n");
                for (String err : parserErrors.getErrors()) errors.append(err).append("\n");
                return errors.toString();
            }

            VGraphASTBuilder builder = new VGraphASTBuilder();
            
            // CORRECCIÓN: Usar ProgramNode directamente
            ProgramNode program = (ProgramNode) builder.visitStart(tree);

            SemanticAnalyzer sema = new SemanticAnalyzer();
            sema.analyze(program);

            if (!sema.getErrors().isEmpty()) {
                for (String err : sema.getErrors()) {
                    errors.append(err).append("\n");
                }
                return errors.toString();
            }

            ObjectMapper mapper = new ObjectMapper();
            ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
            writer.writeValue(new File("ast.json"), program);

            return "";

        } catch (IOException e) {
            return "Error leyendo archivo: " + e.getMessage();
        } catch (Exception e) {
            return "Error inesperado: " + e.getMessage();
        }
    }

    static class CollectingErrorListener extends BaseErrorListener {
        private final List<String> errors = new ArrayList<>();

        public List<String> getErrors() {
            return errors;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, 
                               int line, int charPositionInLine,
                               String msg, RecognitionException e) {
            errors.add(String.format("Línea %d:%d - %s", line, charPositionInLine, msg));
        }
    }
}
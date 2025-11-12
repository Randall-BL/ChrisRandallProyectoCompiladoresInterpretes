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

            // Generación de Código Intermedio (LLVM IR)
            CodeGenerator codeGen = new CodeGenerator();
            String llvmIrCode = codeGen.generate(program);

            try (java.io.FileWriter writer = new java.io.FileWriter("output.ll")) {
                writer.write(llvmIrCode);
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

    public static boolean compileLLVM(String llFilePath, String outputExePath) {
        try {
            // Paso 1: llc - Compila .ll a .o (archivo objeto)
            ProcessBuilder llcBuilder = new ProcessBuilder(
                    "llc", "-filetype=obj", llFilePath, "-o", "output.o"
            );
            Process llcProcess = llcBuilder.start();
            if (llcProcess.waitFor() != 0) {
                try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(llcProcess.getErrorStream()))) {
                    System.err.println("Error durante la compilación con llc:");
                    reader.lines().forEach(System.err::println);
                }
                return false;
            }

            // Paso 2: clang - Enlaza el .o para crear el ejecutable
            ProcessBuilder clangBuilder = new ProcessBuilder(
                    "clang", "output.o", "-o", outputExePath
            );
            Process clangProcess = clangBuilder.start();
            if (clangProcess.waitFor() != 0) {
                try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(clangProcess.getErrorStream()))) {
                    System.err.println("Error durante el enlazado con clang:");
                    reader.lines().forEach(System.err::println);
                }
                return false;
            }

            // Limpia el archivo intermedio
            new java.io.File("output.o").delete();

            return true;
        } catch (java.io.IOException | InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }
}
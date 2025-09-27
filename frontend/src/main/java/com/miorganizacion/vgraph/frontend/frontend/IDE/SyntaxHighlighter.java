package com.miorganizacion.vgraph.frontend.frontend.IDE;

import javax.swing.*;
import javax.swing.text.*;
import java.util.regex.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class SyntaxHighlighter extends JTextPane {
    // Patrón corregido: grupo de color completo
    private static final Pattern PATTERN = Pattern.compile(
        "(?<COMMENT>#.*$)|" +
        "(?<COLOR>\\#[A-Fa-f0-9]{6}\\b)|" +  // Grupo completo y corregido
        "(?<COLORNAMED>\\b(rojo|verde|azul|amarillo|cyan|magenta|blanco|negro)\\b)|" +
        "(?<NUMBER>\\b\\d+\\b)|" +
        "(?<KEYWORD>\\b(draw|setcolor|frame|loop|if|else|wait|line|rect|circle|pixel|cos|sin|int|color)\\b)|" +
        "(?<IDENTIFIER>\\b[a-z][a-z0-9_]{0,9}\\b)",
        Pattern.MULTILINE
    );
    
    // Mapa de estilos para acceso rápido
    private final Map<String, AttributeSet> styles = new HashMap<>();
    
    // Colores personalizados para mejor legibilidad
    private static final Color KEYWORD_COLOR = new Color(150, 0, 0);    // Rojo oscuro
    private static final Color COMMENT_COLOR = new Color(63, 127, 95);   // Verde oscuro
    private static final Color NUMBER_COLOR = new Color(0, 0, 150);      // Azul oscuro
    private static final Color COLOR_LITERAL = new Color(170, 0, 170);   // Magenta
    private static final Color IDENTIFIER_COLOR = new Color(0, 0, 0);    // Negro

    public SyntaxHighlighter() {
        setFont(new Font("Consolas", Font.PLAIN, 14));
        setBackground(new Color(245, 245, 245)); // Fondo ligeramente gris
        setMargin(new Insets(5, 10, 5, 10));     // Márgenes internos
        
        // Inicializar estilos
        initStyles();
    }

    private void initStyles() {
        styles.put("COMMENT", createStyle(COMMENT_COLOR, false));
        styles.put("COLOR", createStyle(COLOR_LITERAL, false));
        styles.put("COLORNAMED", createStyle(COLOR_LITERAL, true));
        styles.put("NUMBER", createStyle(NUMBER_COLOR, false));
        styles.put("KEYWORD", createStyle(KEYWORD_COLOR, true));
        styles.put("IDENTIFIER", createStyle(IDENTIFIER_COLOR, false));
    }

    private AttributeSet createStyle(Color color, boolean bold) {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet attr = sc.addAttribute(SimpleAttributeSet.EMPTY, 
                                          StyleConstants.Foreground, color);
        if (bold) {
            attr = sc.addAttribute(attr, StyleConstants.Bold, true);
        }
        return attr;
    }

    public void highlightSyntax() {
        // Evitar procesamiento innecesario cuando no hay texto
        if (getDocument().getLength() == 0) return;
        
        // Crear un documento temporal para operaciones seguras
        StyledDocument doc = (StyledDocument) getDocument();
        String text;
        try {
            text = doc.getText(0, doc.getLength());
        } catch (BadLocationException e) {
            return;
        }

        // Limpiar estilos previos de manera eficiente
        doc.setCharacterAttributes(0, text.length(), 
                                 styles.get("IDENTIFIER"), true);

        // Aplicar resaltado con procesamiento por líneas
        highlightByLines(doc, text);
    }

    private void highlightByLines(StyledDocument doc, String text) {
        String[] lines = text.split("\n", -1);
        int offset = 0;
        
        for (String line : lines) {
            Matcher matcher = PATTERN.matcher(line);
            
            while (matcher.find()) {
                for (String groupName : styles.keySet()) {
                    if (matcher.group(groupName) != null) {
                        int start = matcher.start(groupName) + offset;
                        int length = matcher.end(groupName) - matcher.start(groupName);
                        doc.setCharacterAttributes(start, length, 
                                                  styles.get(groupName), false);
                        break; // Salir después de aplicar el primer estilo coincidente
                    }
                }
            }
            
            offset += line.length() + 1; // +1 para el carácter de nueva línea
        }
    }
}
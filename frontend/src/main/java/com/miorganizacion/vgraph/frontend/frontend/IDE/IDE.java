package com.miorganizacion.vgraph.frontend.frontend.IDE;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.*;
import java.nio.file.*;
import com.miorganizacion.vgraph.frontend.Main;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class IDE extends JFrame {

    private SyntaxHighlighter editor;
    private JTextArea lineNumbers;
    private JTextArea outputArea;
    private JTextArea errorArea;
    private File currentFile;
    private Timer highlightTimer;
    private DocumentListener docListener;
    private JTabbedPane tabbedPane; // Referencia a tabbedPane	

    public IDE() {
        super("VGraph IDE");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 750);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        // Crear el editor con el nuevo syntax highlighter
        editor = new SyntaxHighlighter();
        
        // Configurar área de números de línea
        lineNumbers = new JTextArea("1");
        lineNumbers.setEditable(false);
        lineNumbers.setBackground(new Color(240, 240, 240));
        lineNumbers.setBorder(new EmptyBorder(0, 5, 0, 5));
        lineNumbers.setFont(new Font("Consolas", Font.PLAIN, 14));
        lineNumbers.setForeground(new Color(100, 100, 100));

        // Timer para el resaltado y actualización de números de línea
        highlightTimer = new Timer(350, e -> doHighlightAndLines());
        highlightTimer.setRepeats(false);

        // Listener para detectar cambios en el editor
        docListener = new DocumentListener() {
            @Override 
            public void insertUpdate(DocumentEvent e) { 
                highlightTimer.restart(); 
            }
            @Override 
            public void removeUpdate(DocumentEvent e) { 
                highlightTimer.restart(); 
            }
            @Override 
            public void changedUpdate(DocumentEvent e) {}
        };
        editor.getDocument().addDocumentListener(docListener);

        // Configuración del panel del editor con números de línea
        JScrollPane scrollEditor = new JScrollPane(editor);
        scrollEditor.setRowHeaderView(lineNumbers);
        scrollEditor.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Áreas de salida y errores con mejor formato
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Consolas", Font.PLAIN, 12));
        outputArea.setBorder(new EmptyBorder(5, 10, 5, 10));
        JScrollPane scrollOutput = new JScrollPane(outputArea);

        errorArea = new JTextArea();
        errorArea.setEditable(false);
        errorArea.setFont(new Font("Consolas", Font.PLAIN, 12));
        errorArea.setForeground(Color.RED);
        errorArea.setBorder(new EmptyBorder(5, 10, 5, 10));
        JScrollPane scrollError = new JScrollPane(errorArea);

        // Pestañas para salida y errores
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Resultado", scrollOutput);
        tabbedPane.addTab("Errores", scrollError);

        // Divisor entre editor y pestañas
        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, scrollEditor, tabbedPane);
        split.setDividerLocation(500);
        split.setResizeWeight(0.7);

        // Barra de menú
        JMenuBar menuBar = new JMenuBar();
        
        // Menú Archivo
        JMenu fileMenu = new JMenu("Archivo");
        fileMenu.setMnemonic('A');
        
        JMenuItem openItem = new JMenuItem("Abrir");
        JMenuItem saveItem = new JMenuItem("Guardar");
        JMenuItem saveAsItem = new JMenuItem("Guardar como...");
        JMenuItem exitItem = new JMenuItem("Salir");
        
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        
        // Menú Ejecutar
        JMenu runMenu = new JMenu("Ejecutar");
        runMenu.setMnemonic('E');
        
        JMenuItem runItem = new JMenuItem("Ejecutar análisis");
        JMenuItem clearItem = new JMenuItem("Limpiar resultados");
        
        runMenu.add(runItem);
        runMenu.add(clearItem);
        
        // Menú Ayuda
        JMenu helpMenu = new JMenu("Ayuda");
        helpMenu.setMnemonic('y');
        JMenuItem aboutItem = new JMenuItem("Acerca de...");
        helpMenu.add(aboutItem);
        
        // Agregar menús a la barra
        menuBar.add(fileMenu);
        menuBar.add(runMenu);
        menuBar.add(helpMenu);
        
        setJMenuBar(menuBar);

        // Eventos de menú
        openItem.addActionListener(e -> openFile());
        saveItem.addActionListener(e -> saveFile(false));
        saveAsItem.addActionListener(e -> saveFile(true));
        exitItem.addActionListener(e -> System.exit(0));
        runItem.addActionListener(e -> runInterpreter());
        clearItem.addActionListener(e -> clearResults());
        aboutItem.addActionListener(e -> showAbout());

        // Contenido principal
        getContentPane().add(split, BorderLayout.CENTER);
        
        // Barra de estado
        JLabel statusBar = new JLabel(" Listo");
        statusBar.setBorder(BorderFactory.createEtchedBorder());
        getContentPane().add(statusBar, BorderLayout.SOUTH);
    }

    private void doHighlightAndLines() {
        SwingUtilities.invokeLater(() -> {
            updateLineNumbers();
            editor.highlightSyntax();
        });
    }

    private void updateLineNumbers() {
        int lines = editor.getDocument().getDefaultRootElement().getElementCount();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= lines; i++) {
            sb.append(i).append("\n");
        }
        lineNumbers.setText(sb.toString());
        
        // Ajustar el ancho de los números de línea
        int maxDigits = String.valueOf(lines).length();
        lineNumbers.setColumns(Math.max(2, maxDigits));
    }

    private void openFile() {
        JFileChooser chooser = new JFileChooser("test");
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("VGraph files", "vgp"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            currentFile = chooser.getSelectedFile();
            try {
                // Desconectar temporalmente el listener
                editor.getDocument().removeDocumentListener(docListener);
                
                // Cargar contenido del archivo
                String text = new String(Files.readAllBytes(currentFile.toPath()));
                editor.setText(text);
                
                // Reconectar listener y actualizar
                editor.getDocument().addDocumentListener(docListener);
                doHighlightAndLines();
                
                setTitle("VGraph IDE - " + currentFile.getName());
            } catch (IOException ex) {
                showError("No se pudo leer el archivo: " + ex.getMessage());
            }
        }
    }

    private void saveFile(boolean saveAs) {
        try {
            if (saveAs || currentFile == null) {
                JFileChooser chooser = new JFileChooser("test");
                chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("VGraph files", "vgp"));
                if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                    currentFile = chooser.getSelectedFile();
                    if (!currentFile.getName().endsWith(".vgp")) {
                        currentFile = new File(currentFile.getAbsolutePath() + ".vgp");
                    }
                } else {
                    return;
                }
            }
            
            // Guardar contenido
            Files.write(currentFile.toPath(), editor.getText().getBytes());
            setTitle("VGraph IDE - " + currentFile.getName());
        } catch (IOException ex) {
            showError("Error al guardar: " + ex.getMessage());
        }
    }

    private void runInterpreter() {
        if (currentFile == null) {
            showError("No hay archivo seleccionado para ejecutar.");
            return;
        }

        saveFile(false); // Guardar antes de ejecutar

        // Limpiar resultados anteriores
        outputArea.setText("");
        errorArea.setText("");

        // Ejecutar análisis
        String result = Main.run(currentFile.getAbsolutePath());

        if (result.isEmpty()) {
                outputArea.setText("Análisis exitoso. AST generado en ast.json.");

                // Ejecutar el script de Python para graficar el AST
                try {
                    ProcessBuilder pb = new ProcessBuilder(
                        "python",
                        "frontend/src/main/java/com/miorganizacion/vgraph/frontend/frontend/IDE/graficador.py"
                        );
                    pb.redirectErrorStream(true);
                    Process process = pb.start();

                    // Leer la salida del script
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    String line;
                    StringBuilder output = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        output.append(line).append("\n");
                    }
                    process.waitFor();
                    outputArea.append("\n" + output.toString());
                } catch (Exception ex) {
                    outputArea.append("\nError ejecutando graficador.py: " + ex.getMessage());
                }
        } else {
            errorArea.setText(result);
            tabbedPane.setSelectedIndex(1); // Seleccionar pestaña de errores
        }
    }
    
    private void clearResults() {
        outputArea.setText("");
        errorArea.setText("");
    }
    
    private void showAbout() {
        JOptionPane.showMessageDialog(this, 
            "VGraph IDE\nVersión 1.0\n\nUn entorno de desarrollo para el lenguaje VGraph",
            "Acerca de VGraph IDE",
            JOptionPane.INFORMATION_MESSAGE);
    }

    private void showError(String msg) {
        JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        // Establecer aspecto moderno
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // Usar apariencia por defecto si falla
        }
        
        SwingUtilities.invokeLater(() -> {
            IDE ide = new IDE();
            ide.setVisible(true);
        });
    }
}
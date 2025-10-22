package com.miorganizacion.vgraph.frontend.frontend.IDE;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.*;
import java.nio.file.*;
import com.miorganizacion.vgraph.frontend.Main;
import com.miorganizacion.vgraph.frontend.TurtlePanel;

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
    private TurtlePanel turtleCanvas;

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

        // ------------------- INICIO DE LA CORRECCIÓN -------------------

        // 1. Crear el nuevo panel para la tortuga y su scroll pane
        turtleCanvas = new TurtlePanel();
        JScrollPane scrollCanvas = new JScrollPane(turtleCanvas);

        // 2. Crear el panel de pestañas para la parte SUPERIOR de la ventana
        JTabbedPane mainDisplay = new JTabbedPane();
        mainDisplay.addTab("Editor", scrollEditor);
        mainDisplay.addTab("Lienzo de Tortuga", scrollCanvas);

        // ------------------- FIN DE LA CORRECCIÓN -------------------

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

        // Pestañas para la parte INFERIOR (salida y errores)
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Resultado", scrollOutput);
        tabbedPane.addTab("Errores", scrollError);

        // --- CAMBIO CLAVE AQUÍ ---
        // CORRECCIÓN: Usar 'mainDisplay' como el componente superior del JSplitPane
        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, mainDisplay, tabbedPane);
        split.setDividerLocation(500);
        split.setResizeWeight(0.7);

        // Barra de menú (sin cambios)
        JMenuBar menuBar = new JMenuBar();
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

        JMenu runMenu = new JMenu("Ejecutar");
        runMenu.setMnemonic('E');
        JMenuItem runItem = new JMenuItem("Ejecutar análisis");
        JMenuItem runLastItem = new JMenuItem("Ejecutar último programa compilado");
        JMenuItem viewASTItem = new JMenuItem("Ver AST");
        JMenuItem clearItem = new JMenuItem("Limpiar resultados");
        runMenu.add(runItem);
        runMenu.add(runLastItem);
        runMenu.addSeparator();
        runMenu.add(viewASTItem);
        runMenu.add(clearItem);

        JMenu helpMenu = new JMenu("Ayuda");
        helpMenu.setMnemonic('y');
        JMenuItem aboutItem = new JMenuItem("Acerca de...");
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(runMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        // Eventos de menú (sin cambios)
        openItem.addActionListener(e -> openFile());
        saveItem.addActionListener(e -> saveFile(false));
        saveAsItem.addActionListener(e -> saveFile(true));
        exitItem.addActionListener(e -> System.exit(0));
        runItem.addActionListener(e -> runInterpreter());
        runLastItem.addActionListener(e -> runLastProgram());
        viewASTItem.addActionListener(e -> showAST());
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
            showError("Primero guarda el archivo para compilarlo.");
            return;
        }
        saveFile(false);
        outputArea.setText("");
        errorArea.setText("");
        turtleCanvas.resetTurtle();

        // ---------------------------------------------------------------
        // PASO 1: Ejecutar el análisis del Frontend (Sintáctico, Semántico y Generación de IR)
        // ---------------------------------------------------------------
        String frontendResult = Main.run(currentFile.getAbsolutePath());

        if (!frontendResult.isEmpty()) {
            // Si el frontend encontró errores, muéstralos y detente.
            errorArea.setText(frontendResult);
            tabbedPane.setSelectedIndex(1); // Muestra la pestaña de errores
            return;
        }

        // Si llegamos aquí, el Frontend fue exitoso.
        outputArea.setText("Análisis de Frontend exitoso. AST y LLVM IR generados.\n");

        // ---------------------------------------------------------------
        // PASO 2: Visualizar el AST con el script de Python
        // ---------------------------------------------------------------
        outputArea.append("Ejecutando visualizador de AST...\n");
        try {
            ProcessBuilder pb = new ProcessBuilder(
                    "python",
                    "frontend/src/main/java/com/miorganizacion/vgraph/frontend/frontend/IDE/graficador.py"
            );
            pb.redirectErrorStream(true);
            Process process = pb.start();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                StringBuilder scriptOutput = new StringBuilder();
                reader.lines().forEach(line -> scriptOutput.append(line).append("\n"));
                process.waitFor();
                outputArea.append(scriptOutput.toString());
            }
        } catch (Exception ex) {
            outputArea.append("ADVERTENCIA: No se pudo ejecutar graficador.py: " + ex.getMessage() + "\n");
        }

        // ---------------------------------------------------------------
        // PASO 3: Compilar el Backend (LLVM IR -> Ejecutable)
        // ---------------------------------------------------------------
        outputArea.append("\nCompilando el backend a un ejecutable...\n");
        boolean compilationSuccess = Main.compileLLVM("output.ll", "archivoObjeto.exe");

        if (!compilationSuccess) {
            errorArea.setText("Error durante la compilación del backend. Revisa la consola del IDE para más detalles.");
            tabbedPane.setSelectedIndex(1);
            return;
        }

        outputArea.append("¡Compilación de Backend exitosa!\n");

        // Generar script wrapper para ejecución directa
        generateExecutableWrapper();
        outputArea.append("✅ Archivos generados:\n");
        outputArea.append("   - archivoObjeto.exe (ejecutable LLVM)\n");
        outputArea.append("   - archivoObjeto.bat (ejecutar para ver dibujo)\n\n");
        outputArea.append("--- Salida del Programa ---\n");

        // ---------------------------------------------------------------
        // PASO 4: Ejecutar el programa compilado y visualizar en el lienzo
        // ---------------------------------------------------------------
        new Thread(() -> {
            try {
                ProcessBuilder pb = new ProcessBuilder("./archivoObjeto.exe");
                Process process = pb.start();
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        final String currentLine = line;
                        // Actualiza la UI en el hilo de eventos de Swing para evitar problemas
                        SwingUtilities.invokeLater(() -> parseAndDraw(currentLine));
                    }
                }
                int exitCode = process.waitFor();
                SwingUtilities.invokeLater(() -> {
                    outputArea.append("--- Ejecución finalizada con código " + exitCode + " ---\n");

                    // Guardar imagen automáticamente si la ejecución fue exitosa
                    if (exitCode == 0) {
                        try {
                            turtleCanvas.saveImage();
                            outputArea.append("💾 Imagen guardada exitosamente en ResultadosDibujos/\n");
                        } catch (IOException ex) {
                            outputArea.append("⚠️ No se pudo guardar la imagen: " + ex.getMessage() + "\n");
                        }
                    }
                });
            } catch (Exception e) {
                SwingUtilities.invokeLater(() -> showError("Error al ejecutar el programa: " + e.getMessage()));
            }
        }).start();
    }

    // Asegúrate de que el método parseAndDraw() también esté en tu clase IDE.java
    private void parseAndDraw(String commandLine) {
        outputArea.append(commandLine + "\n");
        String[] parts = commandLine.split(":");
        String command = parts[0].toUpperCase();

        try {
            switch (command) {
                case "AVANZA":
                    turtleCanvas.avanza(Integer.parseInt(parts[1]));
                    break;
                case "GIRADERECHA":
                    turtleCanvas.giraDerecha(Integer.parseInt(parts[1]));
                    break;
                // Añade casos para GIRAIZQUIERDA, RETROCEDE...
                case "SUBELAPIZ":
                    turtleCanvas.setPenDown(false);
                    break;
                case "BAJALAPIZ":
                    turtleCanvas.setPenDown(true);
                    break;
                case "COLOR":
                    turtleCanvas.setPenColor(parts[1]);
                    break;
                case "PONPOS":
                    turtleCanvas.ponPos(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                    break;
                // Agrega aquí los demás comandos que tu tortuga virtual necesite
            }
        } catch (Exception e) {
            System.err.println("No se pudo parsear el comando: " + commandLine);
        }
    }
    
    private void generateExecutableWrapper() {
        try {
            // Crear script wrapper simple archivoObjeto.bat
            String batContent = "@echo off\r\n" +
                "REM Wrapper para ejecutar el programa con visualización\r\n" +
                "java -cp frontend\\target\\classes com.miorganizacion.vgraph.frontend.ProgramRunner archivoObjeto.exe\r\n";

            Files.write(Paths.get("archivoObjeto.bat"), batContent.getBytes());

        } catch (IOException e) {
            System.err.println("No se pudo generar el wrapper: " + e.getMessage());
        }
    }

    private void runLastProgram() {
        File executable = new File("archivoObjeto.exe");
        if (!executable.exists()) {
            showError("No se encontró el ejecutable compilado.\nPrimero debes compilar un programa.");
            return;
        }

        outputArea.setText("");
        errorArea.setText("");
        turtleCanvas.resetTurtle();
        outputArea.append("Ejecutando último programa compilado...\n");
        outputArea.append("--- Salida del Programa ---\n");

        // Ejecutar en un hilo separado
        new Thread(() -> {
            try {
                ProcessBuilder pb = new ProcessBuilder("./archivoObjeto.exe");
                pb.redirectErrorStream(true);
                Process process = pb.start();

                try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        final String currentLine = line;
                        SwingUtilities.invokeLater(() -> parseAndDraw(currentLine));

                        // Pequeña pausa para visualizar el dibujo progresivamente
                        Thread.sleep(10);
                    }
                }

                int exitCode = process.waitFor();
                SwingUtilities.invokeLater(() -> {
                    outputArea.append("--- Ejecución finalizada con código " + exitCode + " ---\n");

                    // Guardar y mostrar imagen si fue exitoso
                    if (exitCode == 0) {
                        try {
                            turtleCanvas.saveImage();
                            outputArea.append("💾 Imagen guardada exitosamente en ResultadosDibujos/\n");

                            // Cambiar a la pestaña del lienzo para mostrar el resultado
                            JTabbedPane mainDisplay = (JTabbedPane) turtleCanvas.getParent().getParent().getParent();
                            mainDisplay.setSelectedIndex(1); // Seleccionar pestaña "Lienzo de Tortuga"

                            JOptionPane.showMessageDialog(IDE.this,
                                "✅ Programa ejecutado exitosamente\n💾 Imagen guardada en ResultadosDibujos/",
                                "Ejecución Completada",
                                JOptionPane.INFORMATION_MESSAGE);
                        } catch (IOException ex) {
                            outputArea.append("⚠️ No se pudo guardar la imagen: " + ex.getMessage() + "\n");
                        }
                    } else {
                        errorArea.setText("El programa terminó con errores (código: " + exitCode + ")");
                        tabbedPane.setSelectedIndex(1);
                    }
                });
            } catch (Exception e) {
                SwingUtilities.invokeLater(() -> {
                    showError("Error al ejecutar el programa: " + e.getMessage());
                    errorArea.setText("Error: " + e.getMessage());
                    tabbedPane.setSelectedIndex(1);
                });
            }
        }).start();
    }

    private void clearResults() {
        outputArea.setText("");
        errorArea.setText("");
    }
    
    private void showAST() {
        File astFile = new File("ast.png");
        if (!astFile.exists()) {
            showError("No se encontró el archivo ast.png.\nPrimero debes compilar un programa para generar el AST.");
            return;
        }

        try {
            // Cargar la imagen original como BufferedImage para mejor rendimiento
            final java.awt.image.BufferedImage originalImage = javax.imageio.ImageIO.read(astFile);

            // Clase interna para el panel con zoom
            class ZoomablePanel extends JPanel {
                private double scale = 1.0;

                public void setScale(double scale) {
                    this.scale = scale;
                    revalidate();
                    repaint();
                }

                public double getScale() {
                    return scale;
                }

                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;

                    // Activar renderizado de calidad
                    g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                                        RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                    g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
                                        RenderingHints.VALUE_RENDER_QUALITY);
                    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                        RenderingHints.VALUE_ANTIALIAS_ON);

                    // Aplicar transformación de escala
                    g2d.scale(scale, scale);

                    // Dibujar la imagen original (sin reescalar)
                    g2d.drawImage(originalImage, 0, 0, null);
                }

                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(
                        (int)(originalImage.getWidth() * scale),
                        (int)(originalImage.getHeight() * scale)
                    );
                }
            }

            ZoomablePanel imagePanel = new ZoomablePanel();
            JScrollPane scrollPane = new JScrollPane(imagePanel);
            scrollPane.setPreferredSize(new Dimension(800, 600));
            scrollPane.getViewport().setBackground(Color.WHITE);

            // Panel de información
            JPanel infoPanel = new JPanel();
            JLabel zoomLabel = new JLabel("100%");
            JLabel instructionLabel = new JLabel("   💡 Usa CTRL + Rueda del ratón para hacer zoom");
            instructionLabel.setForeground(new Color(100, 100, 100));
            infoPanel.add(new JLabel("Zoom: "));
            infoPanel.add(zoomLabel);
            infoPanel.add(instructionLabel);

            // Agregar MouseWheelListener para zoom con CTRL + Rueda
            scrollPane.addMouseWheelListener(e -> {
                if (e.isControlDown()) {
                    e.consume(); // Evitar el scroll normal

                    double currentScale = imagePanel.getScale();
                    double zoomFactor = 1.1;

                    if (e.getWheelRotation() < 0) {
                        // Zoom In
                        if (currentScale < 5.0) {
                            currentScale *= zoomFactor;
                        }
                    } else {
                        // Zoom Out
                        if (currentScale > 0.1) {
                            currentScale /= zoomFactor;
                        }
                    }

                    imagePanel.setScale(currentScale);
                    zoomLabel.setText(String.format("%.0f%%", currentScale * 100));
                }
            });

            // Crear diálogo
            JDialog astDialog = new JDialog(this, "Árbol de Sintaxis Abstracta (AST)", false);
            astDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            astDialog.setLayout(new BorderLayout());
            astDialog.add(infoPanel, BorderLayout.NORTH);
            astDialog.add(scrollPane, BorderLayout.CENTER);
            astDialog.pack();
            astDialog.setLocationRelativeTo(this);
            astDialog.setVisible(true);
        } catch (Exception ex) {
            showError("Error al cargar la imagen del AST: " + ex.getMessage());
        }
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
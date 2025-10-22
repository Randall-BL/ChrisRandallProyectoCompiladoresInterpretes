package com.miorganizacion.vgraph.frontend;

import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 * Ejecuta el programa compilado y muestra la imagen resultante.
 * Uso: java -cp target/classes com.miorganizacion.vgraph.frontend.ProgramRunner mi_programa.exe
 */
public class ProgramRunner {

    private TurtlePanel turtlePanel;
    private JFrame frame;

    public static void main(String[] args) {
        String executablePath = "archivoObjeto.exe";

        if (args.length >= 1) {
            executablePath = args[0];
        }

        ProgramRunner runner = new ProgramRunner();
        runner.runAndDisplay(executablePath);
    }

    public ProgramRunner() {
        // Crear el panel de dibujo
        turtlePanel = new TurtlePanel();
        turtlePanel.setPreferredSize(new Dimension(800, 600));

        // Crear ventana
        frame = new JFrame("Resultado del Programa VGraph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(turtlePanel), BorderLayout.CENTER);

        // Panel inferior con botones
        JPanel buttonPanel = new JPanel();
        JButton saveButton = new JButton("💾 Guardar Imagen");
        saveButton.addActionListener(e -> saveImage());
        buttonPanel.add(saveButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void runAndDisplay(String executablePath) {
        try {
            // Mostrar ventana
            SwingUtilities.invokeLater(() -> frame.setVisible(true));

            // Ejecutar el programa
            System.out.println("Ejecutando: " + executablePath);
            ProcessBuilder pb = new ProcessBuilder(executablePath);
            pb.redirectErrorStream(true);
            Process process = pb.start();

            // Leer y procesar comandos
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Comando: " + line);
                    final String currentLine = line;
                    SwingUtilities.invokeLater(() -> parseAndDraw(currentLine));

                    // Pequeña pausa para que se vea el dibujo progresivamente
                    Thread.sleep(10);
                }
            }

            int exitCode = process.waitFor();
            System.out.println("Programa finalizado con código: " + exitCode);

            // Si fue exitoso, guardar automáticamente
            if (exitCode == 0) {
                SwingUtilities.invokeLater(() -> {
                    try {
                        turtlePanel.saveImage();
                        System.out.println("✅ Imagen guardada automáticamente en ResultadosDibujos/");
                        JOptionPane.showMessageDialog(frame,
                            "Dibujo completado y guardado exitosamente en ResultadosDibujos/",
                            "Éxito",
                            JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException ex) {
                        System.err.println("⚠️ No se pudo guardar la imagen: " + ex.getMessage());
                    }
                });
            }

        } catch (Exception e) {
            System.err.println("Error al ejecutar el programa: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame,
                "Error al ejecutar: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private void parseAndDraw(String commandLine) {
        String[] parts = commandLine.split(":");
        if (parts.length == 0) return;

        String command = parts[0].toUpperCase();

        try {
            switch (command) {
                case "AVANZA":
                    if (parts.length > 1) {
                        turtlePanel.avanza(Double.parseDouble(parts[1]));
                    }
                    break;
                case "GIRADERECHA":
                    if (parts.length > 1) {
                        turtlePanel.giraDerecha(Double.parseDouble(parts[1]));
                    }
                    break;
                case "GIRAIZQUIERDA":
                    if (parts.length > 1) {
                        turtlePanel.giraDerecha(-Double.parseDouble(parts[1]));
                    }
                    break;
                case "RETROCEDE":
                    if (parts.length > 1) {
                        turtlePanel.avanza(-Double.parseDouble(parts[1]));
                    }
                    break;
                case "SUBELAPIZ":
                    turtlePanel.setPenDown(false);
                    break;
                case "BAJALAPIZ":
                    turtlePanel.setPenDown(true);
                    break;
                case "COLOR":
                    if (parts.length > 1) {
                        turtlePanel.setPenColor(parts[1]);
                    }
                    break;
                case "PONPOS":
                    if (parts.length > 2) {
                        turtlePanel.ponPos(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                    }
                    break;
                default:
                    System.out.println("Comando desconocido: " + command);
            }
        } catch (Exception e) {
            System.err.println("No se pudo parsear el comando: " + commandLine);
            e.printStackTrace();
        }
    }

    private void saveImage() {
        try {
            turtlePanel.saveImage();
            JOptionPane.showMessageDialog(frame,
                "Imagen guardada exitosamente en ResultadosDibujos/",
                "Guardado",
                JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame,
                "Error al guardar: " + ex.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
}


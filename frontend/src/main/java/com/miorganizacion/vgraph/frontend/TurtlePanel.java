package com.miorganizacion.vgraph.frontend;

// TurtlePanel.java (nuevo archivo)
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

public class TurtlePanel extends JPanel {
    private double turtleX, turtleY;
    private double angle; // 0=derecha, 90=arriba, 180=izquierda, 270=abajo
    private boolean isPenDown;
    private Color penColor;
    private final List<Line2D.Double> lines = new ArrayList<>();

    public TurtlePanel() {
        setBackground(Color.WHITE);
        resetTurtle();
    }

    public void resetTurtle() {
        this.turtleX = getWidth() / 2.0;
        this.turtleY = getHeight() / 2.0;
        this.angle = 90.0; // Apuntando hacia arriba
        this.isPenDown = true;
        this.penColor = Color.BLACK;
        lines.clear();
        repaint();
    }

    public void avanza(int distance) {
        double newX = turtleX + distance * Math.cos(Math.toRadians(angle));
        double newY = turtleY - distance * Math.sin(Math.toRadians(angle)); // Restamos porque Y crece hacia abajo
        if (isPenDown) {
            lines.add(new Line2D.Double(turtleX, turtleY, newX, newY));
        }
        this.turtleX = newX;
        this.turtleY = newY;
        repaint();
    }

    public void giraDerecha(int degrees) {
        this.angle -= degrees;
    }

    public void setPenDown(boolean down) {
        this.isPenDown = down;
    }

    public void setPenColor(String colorName) {
        switch(colorName.toLowerCase()) {
            case "rojo": this.penColor = Color.RED; break;
            case "azul": this.penColor = Color.BLUE; break;
            default: this.penColor = Color.BLACK; break;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibuja todas las líneas guardadas
        g2d.setColor(penColor);
        for (Line2D.Double line : lines) {
            g2d.draw(line);
        }

        // Dibuja la tortuga (un simple triángulo)
        g2d.setColor(Color.GREEN);
        g2d.translate(turtleX, turtleY);
        g2d.rotate(-Math.toRadians(angle - 90)); // Ajustar rotación
        int[] xPoints = {0, -5, 5};
        int[] yPoints = {-8, 8, 8};
        g2d.fillPolygon(xPoints, yPoints, 3);
    }

    public void ponPos(int x, int y) {
    // Según el enunciado, ponpos mueve la tortuga sin dibujar[cite: 968].
        this.turtleX = x;
        this.turtleY = y;
        repaint(); // Vuelve a dibujar el panel para mostrar la tortuga en su nueva posición.
    }
}
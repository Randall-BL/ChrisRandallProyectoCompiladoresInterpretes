package com.miorganizacion.vgraph.frontend;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.List;

public class TurtlePanel extends JPanel {
    private double turtleX, turtleY;
    private double angle; // 0=derecha, 90=arriba, 180=izquierda, 270=abajo
    private boolean isPenDown;
    private Color penColor;
    private final List<ColoredLine> lines = new ArrayList<>();

    private static class ColoredLine {
        final Line2D.Double line;
        final Color color;
        ColoredLine(Line2D.Double line, Color color) {
            this.line = line;
            this.color = color;
        }
    }

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

    public void avanza(double distance) {
        double newX = turtleX + distance * Math.cos(Math.toRadians(angle));
        double newY = turtleY - distance * Math.sin(Math.toRadians(angle));
        if (isPenDown) {
            lines.add(new ColoredLine(new Line2D.Double(turtleX, turtleY, newX, newY), penColor));
        }
        this.turtleX = newX;
        this.turtleY = newY;
        repaint();
    }


    public void giraDerecha(double degrees) {
        this.angle -= degrees;
        repaint();
    }


    public void setPenDown(boolean down) {
        this.isPenDown = down;
        repaint();
    }

    public void setPenColor(String colorName) {
        if (colorName == null) {
            this.penColor = Color.BLACK;
            repaint();
            return;
        }

        String s = colorName.trim().toLowerCase();
        try {
            if (s.startsWith("#")) {
                // Soporta literal hex como #RRGGBB
                this.penColor = Color.decode(s);
            } else {
                switch (s) {
                    case "rojo": this.penColor = Color.RED; break;
                    case "verde": this.penColor = Color.GREEN; break;
                    case "azul": this.penColor = Color.BLUE; break;
                    case "amarillo": this.penColor = Color.YELLOW; break;
                    case "cyan": this.penColor = Color.CYAN; break;
                    case "magenta": this.penColor = Color.MAGENTA; break;
                    case "blanco": this.penColor = Color.WHITE; break;
                    case "negro": this.penColor = Color.BLACK; break;
                    default: this.penColor = Color.BLACK; break;
                }
            }
        } catch (NumberFormatException ex) {
            this.penColor = Color.BLACK;
        }
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibuja todas las líneas guardadas con su color original
        for (ColoredLine cl : lines) {
            g2d.setColor(cl.color);
            g2d.draw(cl.line);
        }

        // Dibuja la tortuga (un simple triángulo)
        AffineTransform old = g2d.getTransform();
        g2d.setColor(Color.GREEN);
        g2d.translate(turtleX, turtleY);
        g2d.rotate(-Math.toRadians(angle - 90)); // Ajustar rotación
        int[] xPoints = {0, -5, 5};
        int[] yPoints = {-8, 8, 8};
        g2d.fillPolygon(xPoints, yPoints, 3);
        g2d.setTransform(old);
    }

    public void ponPos(double x, double y) {
        this.turtleX = x;
        this.turtleY = y;
        repaint();
    }
}

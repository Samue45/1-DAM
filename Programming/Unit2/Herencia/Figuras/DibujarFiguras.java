package Programming.Unit2.Herencia.Figuras;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
public class DibujarFiguras {


    // Método para dibujar un círculo
    public static void drawCircle(Color color, Circunferencia circunferencia) {
        JFrame frame = createFrame("Dibujar Círculo");
        frame.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(color);
                int diameter = circunferencia.getRadio()*2;
                g2d.fillOval(circunferencia.getPunto().getX(), circunferencia.getPunto().getY(), diameter, diameter);
            }
        });
        frame.setVisible(true);
    }

    // Método para dibujar un rectángulo
    public static void drawRectangle(Color color, Rectangulo rectangulo) {
        JFrame frame = createFrame("Dibujar Rectángulo");
        frame.add(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(color);
                g2d.fillRect(rectangulo.getPunto().getX(), rectangulo.getPunto().getY(), rectangulo.getBase(), rectangulo.getAltura());
            }
        });
        frame.setVisible(true);
    }

    // Método auxiliar para crear un marco

    private static JFrame createFrame(String title) {
        JFrame frame = new JFrame(title);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        return frame;
    }
}


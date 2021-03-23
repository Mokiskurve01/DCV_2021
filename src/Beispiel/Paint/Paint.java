package Beispiel.Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Paint extends JFrame implements MouseMotionListener {
    private int x;
    private int y;

    public Paint() {

        setBackground(Color.red);
        setTitle("Painter");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.addMouseMotionListener(this);
        setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint(); // ruft die methode mit einem speziellen Parameter auf
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(x, y, 10, 10);

    }
}

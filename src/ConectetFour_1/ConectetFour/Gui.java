package ConectetFour_1.ConectetFour;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class Gui extends JFrame {
    private JFrame window;
    private JPanel mainPanel;
    private Circl[][] field;

    public Gui(int xpos, int ypos, int cellSize, MouseListener mouseListener) {
        window = new JFrame();
        window.setTitle("!ConectFour");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);//Enum
        window.setVisible(true);
        window.setSize(cellSize * xpos, cellSize * ypos);
        window.setResizable(false);
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(ypos, xpos));
        mainPanel.setBackground(new Color(9, 45, 163));

        window.getContentPane().add(mainPanel);

        field = new Circl[xpos][ypos];

        for (int y = 0; y < ypos; y++) {
            for (int x = 0; x < xpos; x++) {
                field[x][y] = new Circl(cellSize);
                field[x][y].addMouseListener(mouseListener);
                mainPanel.add(field[x][y]);
            }
        }
    }

    public void update(CellType[][] board) {
        for (int y = 0; y < board[0].length; y++) {
            for (int x = 0; x < board.length; x++) {
                field[x][y].setColor(board[x][y]);
            }
        }
        window.repaint();
    }

    public Circl[][] getField() {
        return field;
    }

    public static void winner() {

        JFrame frame = new JFrame();
        JLabel label = new JLabel(" Winner Winner Winner Winner Winner Winner Winner Winner ");
        JPanel panel = new JPanel();

        panel.add(label);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.setSize(500,80);
        //frame.pack();                   //passt das Fensters dar länge der Textes an
        frame.setVisible(true);

    }
}

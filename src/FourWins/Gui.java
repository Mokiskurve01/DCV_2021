package FourWins;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class Gui extends JFrame {
    private JFrame window;
    private JPanel mainPanel;
    private Circle[][] field;



    public Gui(int xPos, int yPos, int cellSize, MouseListener mouseListener) {
        window = new JFrame();
        window.setTitle("!FourWins");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);//Enum
        window.setVisible(true);//sichtbar
        window.setSize(cellSize * xPos, cellSize * yPos);
        window.setResizable(false);
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(yPos, xPos));
        mainPanel.setBackground(new Color(9, 45, 163));

        window.getContentPane().add(mainPanel);

        field = new Circle[xPos][yPos];

        for (int y = 0; y < yPos; y++) {
            for (int x = 0; x < xPos; x++) {
                field[x][y] = new Circle(cellSize);
                field[x][y].addMouseListener(mouseListener);
                mainPanel.add(field[x][y]);
            }
        }
    }

    public void update(CellType[][] board) {
        for (int y = 0; y < board[0].length; y++) {
            for (int x = 0; x < board.length; x++) {
                field[x][y].setColour(board[x][y]);
            }
        }
        window.repaint();
    }
    public Circle[][] getField() {
        return field;
    }
}

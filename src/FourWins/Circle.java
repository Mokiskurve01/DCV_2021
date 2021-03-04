package FourWins;

import javax.swing.*;
import java.awt.*;

public class Circle extends JPanel {
    private Color colour;
    private int cellSize;

    private final Color myRed = new Color(243, 19, 19);
    private final Color myGreen = new Color(90, 217, 12);
    private final Color myGray = new Color(224, 224, 224);

    public Circle(int cellSize) {
        this.cellSize = cellSize;
        this.setColour(CellType.EMPTY);
    }

    public void setColour(CellType cell) {
        if (cell == CellType.RED) {
            colour = myRed;
        } else if (cell == CellType.GREEN) {
            colour = myGreen;
        } else {
            colour = myGray;
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(this.colour);
        g.fillOval((cellSize - this.cellSize / 10 * 8) / 2, (cellSize - this.cellSize / 10 * 8) / 2,
                cellSize / 10 * 8, cellSize / 10 * 8);
    }
}

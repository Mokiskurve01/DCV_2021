package ConectetFour;

import javax.swing.*;
import java.awt.*;

public class Circl extends JPanel {
    private Color color;
    private int cellSize;

    private final Color myRed = new Color(243, 19, 19);
    private final Color myGreen = new Color(90, 217, 12);
    private final Color myGray = new Color(224, 224, 224);

    public Circl(int cellSize) {
        this.cellSize = cellSize;
        this.setColor(CellType.EMPTY);
    }

    public void setColor(CellType cell) {
        if (cell == CellType.RED) {
            color = myRed;
        } else if (cell == CellType.GREEN) {
            color = myGreen;
        } else {
            color = myGray;
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(this.color);
        g.fillOval((cellSize - this.cellSize / 10 * 8) / 2, (cellSize - this.cellSize / 10 * 8) / 2, cellSize / 10 * 8, cellSize / 10 * 8);
    }
}

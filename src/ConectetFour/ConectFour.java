package ConectetFour;

import java.awt.event.*;

public class ConectFour {

    private Gui gui;
    private Board board;

    public ConectFour(int xlen, int ylen, int cellSize) {

        this.gui = new Gui(xlen, ylen, cellSize,new ClickEventHandler());
        this.board = new Board(xlen, ylen);

    }
    private class ClickEventHandler implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            Circl cirleSender = (Circl)e.getSource();

            var field = gui.getField();
            for (int y = 0; y <field[0].length ; y++){
                for (int x = 0; x < field.length; x++) {
                    if(field[x][y] == cirleSender){
                        if(board.throwDisc(x)){
                            gui.update(board.getBoard());
                            return;
                        }
                   }
                }
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}

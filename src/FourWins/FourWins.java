package FourWins;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FourWins {

    private Gui gui;
    private Board board;

    public FourWins(int xLenght, int yLenght, int cellSize) {

        this.gui = new Gui(xLenght, yLenght, cellSize,new ClickEventHandler());
        this.board = new Board(xLenght, yLenght);

    }
    private class ClickEventHandler implements MouseListener {//Unterklasse

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            Circle cirleSender = (Circle)e.getSource();

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

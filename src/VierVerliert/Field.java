package VierVerliert;

public class Field {

    String[][] board = new String[7][7];
    int zeile = 1;

    public void resetField() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i < 6) {
                    board[i][j] = CellType.EMPTY.getSym();
                } else {
                    board[i][j] = String.valueOf(" " + zeile + " ");
                    zeile++;
                }
            }
        }
    }

    public void move(Position position) {
        switch (position.getPosition()) {
            case 1 -> board[5][0] = CellType.PLAYER1.getSym();
            case 2 -> board[5][1] = CellType.PLAYER1.getSym();
            case 3 -> board[5][2] = CellType.PLAYER1.getSym();
            case 4 -> board[5][3] = CellType.PLAYER1.getSym();
            case 5 -> board[5][4] = CellType.PLAYER1.getSym();
            case 6 -> board[5][5] = CellType.PLAYER1.getSym();
            case 7 -> board[5][6] = CellType.PLAYER1.getSym();
        }
    }


    public void printField() {
        for (String[] spalte : board) {
            for (String aString : spalte) {
                System.out.print(aString);
            }
            System.out.println();
        }

    }

    public boolean isEmpty() {
        return true;
    }

    public boolean isDraw() {
        return false;
    }

    public boolean isWinner() {
        return false;
    }
}

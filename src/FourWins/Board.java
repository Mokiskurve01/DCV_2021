package FourWins;

public class Board {
    private CellType[][] board;
    private boolean playerTurn;

    public Board(int xLenght, int yLenght) {
        this.board = new CellType[xLenght][yLenght];
        this.playerTurn = true;

        for (int y = 0; y < yLenght; y++) {
            for (int x = 0; x < xLenght; x++) {
                board[x][y] = CellType.EMPTY;
            }
        }
    }

    public boolean throwDisc(int xPos) {
        for (int y = board[0].length-1; y >= 0; y--) {
            if (board[xPos][y] == CellType.EMPTY) {
                board[xPos][y] = this.playerTurn ? CellType.RED : CellType.GREEN;
                this.playerTurn ^= true;//Bitwiese XOR operator to switch boolean;
                return true;
            }
        }
        return false;
    }
    public CellType[][] getBoard() {
        return board;
    }
}

package ConectetFour;

public class Board {
    private CellType[][] board;
    private boolean playerTurn;

    public Board(int xLen, int yLen) {
        this.board = new CellType[xLen][yLen];
        this.playerTurn = true;

        for (int y = 0; y < yLen; y++) {
            for (int x = 0; x < xLen; x++) {
                board[x][y] = CellType.EMPTY;
            }
        }
    }

    public boolean throwDisc(int xpos) {
        for (int y = board[0].length-1; y >= 0; y--) {
            if (board[xpos][y] == CellType.EMPTY) {
                board[xpos][y] = this.playerTurn ? CellType.RED : CellType.GREEN;
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

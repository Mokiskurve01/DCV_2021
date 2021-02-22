package VierVerliert;


public class Field {

    String[][] board = new String[7][7];

    public String[][] getBoard() {
        return board;
    }

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

    public String player;

    public void move(Position position) {
        int count = 0;

        for (int i = board.length - 2; i >= 0; i--) {
            if (count % 2 == 0) {//spieler wechsel gerade zahl gibt kein rest
                player = CellType.PLAYER1.getSym();
            } else {
                player = CellType.PLAYER2.getSym();
            }
            if (position.getPosition().equals("1") && board[i][0].equals(CellType.EMPTY.getSym())) {
                board[i][0] = player;
                break;
            } else if (position.getPosition().equals("2") && board[i][1].equals(CellType.EMPTY.getSym())) {
                board[i][1] = player;
                break;
            } else if (position.getPosition().equals("3") && board[i][2].equals(CellType.EMPTY.getSym())) {
                board[i][2] = player;
                break;
            } else if (position.getPosition().equals("4") && board[i][3].equals(CellType.EMPTY.getSym())) {
                board[i][3] = player;
                break;
            } else if (position.getPosition().equals("5") && board[i][4].equals(CellType.EMPTY.getSym())) {
                board[i][4] = player;
                break;
            } else if (position.getPosition().equals("6") && board[i][5].equals(CellType.EMPTY.getSym())) {
                board[i][5] = player;
                break;
            } else if (position.getPosition().equals("7") && board[i][6].equals(CellType.EMPTY.getSym())) {
                board[i][6] = player;
                break;
            }
            count++;
        }
    }
       /* switch (position.getPosition()) {
            case 1 -> board[i][0] = CellType.PLAYER1.getSym();
            case 2 -> board[i][1] = CellType.PLAYER1.getSym();
            case 3 -> board[i][2] = CellType.PLAYER1.getSym();
            case 4 -> board[i][3] = CellType.PLAYER1.getSym();
            case 5 -> board[i][4] = CellType.PLAYER1.getSym();
            case 6 -> board[i][5] = CellType.PLAYER1.getSym();
            case 7 -> board[i][6] = CellType.PLAYER1.getSym();
        }
        */

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

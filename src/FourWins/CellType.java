package FourWins;

public enum CellType {
    EMPTY("Leeres Feld"),
    RED("Player 1"),
    GREEN("Player2");

    private final String player;

    CellType (String playerNumber){
        player=playerNumber;
    }

    public String getPlayer() {
        return player;
    }
}

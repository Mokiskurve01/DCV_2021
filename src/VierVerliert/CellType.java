package VierVerliert;

public enum CellType {
    EMPTY(" . "), PLAYER1(" O "), PLAYER2(" X ");

    private final String sym;

    CellType(String symbol) {
        sym = symbol;
    }

    public String getSym() {
        return sym;
    }
}

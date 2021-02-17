package Skiverleih;

public class Produkt {

    private static int zaehler = 0;

    private Kategorie kategorie;
    private final int inventarId;
    private boolean verfuegbar;
    // private boolean isRented;

    public Produkt(Kategorie kategorie) {
        this.kategorie = kategorie;
        this.inventarId = zaehler++;
        verfuegbar = true;
    }

    public Kategorie getKategorie() {
        return kategorie;
    }

    public void setCategory(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    public boolean getVerfuegbar() {
        return verfuegbar;
    }

    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }
}
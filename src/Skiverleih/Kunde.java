package Skiverleih;

import java.util.List;
import java.util.Random;

public class Kunde {
    private final double WARSCHEINDLICHKEIT = 1;
    private final String vorname;
    private final String nachname;
    private Reserviert reserviert;

    public Kunde(String vor, String nach) {
        vorname = vor;
        nachname = nach;
    }

    public void reserviertProdukt(Kategorie kategorie, List<Produkt> produkts) {
        var anbieter = waehleShop(WARSCHEINDLICHKEIT);

        if (!anbieter.verfuegbar(kategorie, produkts)) {
            System.err.println("Nicht verfügbar: " + kategorie);
        } else {
            anbieter.reserviert(kategorie, produkts);
        }
    }

    public IAnbieter waehleShop(double warscheindlichkeit) {
        Random random = new Random();
        IAnbieter anbieter = null;
        var shop = Shop.getInstance();

        if (random.nextDouble() > warscheindlichkeit) {
            anbieter = shop.getWebShop();
        } else {
            anbieter = shop.getVerkaeufer();
        }
        return anbieter;
    }
}
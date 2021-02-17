package Skiverleih;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulation {
    private int tick;
    private final Shop shop = Shop.getInstance();
    private final List<Produkt> produkte = new ArrayList<>(shop.getProdukte());

    public void run() {

        var kunden = SimulationFactory.herstellenKunde(30);

        sieheVerfuegbareProdukte();

        for (Kunde kunde : kunden) {
            kundeReserviert(kunde, produkte);
        }

        sieheVerfuegbareProdukte();
    }

    private void sieheVerfuegbareProdukte() {
        var values = Kategorie.values();
        int zaehler;

        System.out.println("Verfügbare Produkte: ");
        for (Kategorie value : values) {
            zaehler = 0;
            for (Produkt produkt : produkte) {
                if (produkt.getKategorie().equals(value) && produkt.getVerfuegbar()) {
                    zaehler++;
                }
            }
            System.out.println(value + ": " + zaehler + " | Preis pro Tag: " + value.getPrice());
        }
        System.out.println("-------------------");
    }

    private void kundeReserviert(Kunde kunde, List<Produkt> produkte) {
        var values = Kategorie.values();
        Random random = new Random();
        var randomProdukt = values[random.nextInt(values.length)];
        kunde.reserviertProdukt(randomProdukt, produkte);
    }
}
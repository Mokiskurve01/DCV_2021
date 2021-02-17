package Skiverleih;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationFactory {

    private static final String[] vorname = new String[]{"Ali", "Hari", "Bokhee", "Eric", "Jo"};
    private static final String[] nachname = new String[]{"Schmid", "Muller", "Metzger", "Bäcker", "Yan"};
    private static final Random random = new Random(System.currentTimeMillis());

    public static List<Kunde> herstellenKunde(int max) {
        List<Kunde> kundes = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            String vor = vorname[random.nextInt(vorname.length - 1)];
            String nach = nachname[random.nextInt(nachname.length - 1)];
            kundes.add(new Kunde(vor, nach));
        }
        return kundes;
    }

    public static List<Produkt> herstellenProdukte(int max) {
        List<Produkt> produkte = new ArrayList<>();
        var values = Kategorie.values();

        for (Kategorie value : values) {
            for (int i = 0; i < max; i++) {
                produkte.add(new Produkt(value));
            }
        }
        return produkte;
    }

    public static List<Verkaeufer> herstellenVerkaeufer(int max) {
        List<Verkaeufer> verkaeufer = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            String first = vorname[random.nextInt(vorname.length - 1)];
            String last = nachname[random.nextInt(nachname.length - 1)];
            verkaeufer.add(new Verkaeufer(first, last));
        }
        return verkaeufer;
    }
}
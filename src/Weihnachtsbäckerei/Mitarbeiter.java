package Weihnachtsbäckerei;

import java.util.Random;
import java.util.Vector;

public class Mitarbeiter {
    private String name;

    public Mitarbeiter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void mitarbeiterKeksAusgabe(Vector mitarbieter, Vector keks) {
        Random random = new Random();//objekt vom typ random erzeugen

        int j = 0;//für die ausgabe auf der konsole verwende ich eine verschachtelte for schleife
        int k = 3;//
        for (int i = 0; i < mitarbieter.size(); i++) {
            int zufallZahl = random.nextInt(keks.size());//zufall zahl für den lieblingskeks
            System.out.println("  Mitarbeiter " + (i + 1) + ": " + mitarbieter.elementAt(i) + "-Lieblingskeks: " + keks.elementAt(zufallZahl));
            System.out.println("    " + mitarbieter.elementAt(i) + " ist zuständig für: ");
            for (j = j; j < k; j++) {
                System.out.println("     - " + keks.elementAt(j));
            }
            k += 3;
        }
    }
}

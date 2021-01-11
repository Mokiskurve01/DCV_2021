package Weihnachtsbäckerei;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Baeckerei baeckerei = new Baeckerei("Plazi Bäck");//neues objekt erzeugen und zuweisung der daten für den Konstruktor
        System.out.println(baeckerei);

        Vector mitarbieter = new Vector();//neuen vector anlegen
        Mitarbeiter eins = new Mitarbeiter("Peter");// neuen mitarbeiter erzeugen und den namen zufügen
        Mitarbeiter zwei = new Mitarbeiter("Claudia");
        Mitarbeiter drei = new Mitarbeiter("Susi");
        mitarbieter.addElement(eins);//einfügen am Ende erfolgt mit addElement
        mitarbieter.addElement(zwei);
        mitarbieter.insertElementAt(drei, 2);// Element an einer beliebigen Stelle einfügen mit insertElementAt

        Vector keks = new Vector();
        Keks schoko = new Keks("Sckoko-Keks");
        Keks vanille = new Keks("Vanille-Keks");
        Keks erdbeer = new Keks("Erdbeer-Keks");
        Keks kokos = new Keks("Kokos-Keks");
        Keks rum = new Keks("Rum-Keks");
        Keks glasur = new Keks("Glasur-Keks");
        Keks vegan = new Keks("Vegan-Keks");
        Keks marmelade = new Keks("Marmelade-Keks");
        Keks streusel = new Keks("Streusel-Keks");
        keks.add(schoko);
        keks.add(vanille);
        keks.add(erdbeer);
        keks.add(kokos);
        keks.add(glasur);
        keks.add(vegan);
        keks.add(marmelade);
        keks.add(streusel);
        keks.insertElementAt(rum, 4);

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
        extracted();
    }

    private static void extracted() {
        Scanner scanner = new Scanner(System.in);
        Kunde kunde=new Kunde();
        System.out.print("Name eingeben->");
        String name = scanner.next();
        kunde.setName(name);
        System.out.print("Adresse eingeben->");
        String adresse = scanner.next();
        kunde.setAdresse(adresse);
        System.out.println("Kundenname lautet: " + name);
        System.out.println("Lieferadresse ist: " + adresse);
    }
}

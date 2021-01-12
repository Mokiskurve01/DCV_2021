package Weihnachtsbäckerei;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

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

        // Mitarbeiter.mitarbeiterKeksAusgabe(mitarbieter, keks);
        // Kunde.eingabe();
        System.out.println("Start der Bestellung");
        boolean nochmal = true;
        while (nochmal) {
            System.out.print("[1.Bestellung 2.Ende]->");
            int bestellung = scanner.nextInt();
            if (bestellung == 1) {
                System.out.println("Wählen Sie einen Mitarbeiter?");
                System.out.print("[1." + mitarbieter.elementAt(0) + " 2." + mitarbieter.elementAt(1) + " 3." + mitarbieter.elementAt(2) + "]->");
                int auswahlMitarbeiter = scanner.nextInt();
                if (auswahlMitarbeiter == 1) {
                    int i = 0;
                    auswahlKeks(mitarbieter, keks, i);
                } else if (auswahlMitarbeiter == 2) {
                    int i = 3;
                    auswahlKeks(mitarbieter, keks, i);
                } else if (auswahlMitarbeiter == 3) {
                    int i = 6;
                    auswahlKeks(mitarbieter, keks, i);
                } else {
                    System.out.println("Falsche Eingabe");
                }
            } else {
                nochmal = false;
            }
        }
        System.out.println("Ende");
    }

    private static void auswahlKeks(Vector mitarbieter, Vector keks, int i) {
        System.out.println("Wählen Sie einen Keks von " + mitarbieter.elementAt(i) + "?");
        System.out.print("[1." + keks.elementAt(i) + " 2." + keks.elementAt(++i) + " 3." + keks.elementAt(++i) + "]->");
        int auswahlKeks = scanner.nextInt();
        if (auswahlKeks == 1) {
            System.out.println(keks.elementAt(i + 0));
        } else if (auswahlKeks == 2) {
            System.out.println(keks.elementAt(i + 1));
        } else if (auswahlKeks == 3) {
            System.out.println(keks.elementAt(i + 2));
        } else {
            System.out.println("Falsche Eingabe");
        }
    }

}





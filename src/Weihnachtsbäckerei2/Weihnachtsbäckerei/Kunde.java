package Weihnachtsbäckerei2.Weihnachtsbäckerei;

import java.util.Scanner;

public class Kunde {
    private String name;
    private String adresse;

    public void setName(String name) {
        this.name = name;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public static void eingabe() {//eingabe über scanner
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

package Weihnachtsbäckerei;

import java.util.Scanner;

public class Mitarbeiter {
    private String name;

    public Mitarbeiter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void extracted() {
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

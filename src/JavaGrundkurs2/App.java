package JavaGrundkurs2;

import java.util.Scanner;

public class App {
    private Scanner scanner = new Scanner(System.in);
    private Lebewesen lebewesen;
    private String[] ergebnisse = new String[BMIRechner.MAX_Anzahl];
    private int index = -1;

    public static void main(String[] args) {
        new App();
    }

    private App() {
        System.out.println("Programm Start");
        boolean nochmal = true;
        while (nochmal && index < BMIRechner.MAX_Anzahl) {
            System.out.print("[1=Eingabe 2=Verarbeiten 3=Ausgabe 4=Ende] >");
            int auswahl = scanner.nextInt();
            if (auswahl == 1) {
                gibEin();
            } else if (auswahl == 2) {
                verarbeite();
            } else if (auswahl == 3) {
                gibAus();
            } else if (auswahl == 4) {
                nochmal = false;
            } else {
                System.out.println("BMI [Fasche eingabe!]");
            }
        }
        scanner.close();
        System.out.println("Programm Ende");
    }

    private void gibEin() {
        while (true) {
            System.out.println("BMI [1=Hund 2=Fisch] > ");
            int lebewesenTyp = scanner.nextInt();
            if (lebewesenTyp == 1) {
                lebewesen = new Hund();
                break;
            } else if (lebewesenTyp == 2) {
                lebewesen = new Fisch();
                break;
            } else {
                System.out.println("BMI [Falsche Eingabe]");
            }
        }
        if (lebewesen instanceof Hund) {
            System.out.println("Hund");
        } else if (lebewesen instanceof Fisch) {
            System.out.println("Fisch");
        }

        System.out.print("BMI [Geben Sie den Name ein] > ");
        String name = scanner.next();
        lebewesen.setName(name);
        System.out.print("BMI [Geben Sie die Groesse(m) ein] > ");
        double groesse = scanner.nextDouble();
        lebewesen.setGroesse(groesse);
        System.out.print("BMI [Geben Sie die Gewicht(kg) ein] > ");
        double gewicht = scanner.nextDouble();
        lebewesen.setGewicht(gewicht);

    }

    private void verarbeite() {
        BMIRechner rechner = new BMIRechner();
        ergebnisse[++index] = rechner.pruefe(lebewesen);
    }

    private void gibAus() {
        int i = -1;
        for (String ergebnis : ergebnisse) {
            if (++i > index) {
                break;
            }
            System.out.println("BMI [ergebnis= " + ergebnis + " ]");
        }
    }
}

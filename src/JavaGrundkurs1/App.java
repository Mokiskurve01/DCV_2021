package JavaGrundkurs1;

/***
 * Grundlagen der Vererbung
 * Überladen und überschreiben
 * Polymorphie
 * Klassenvariablen
 * Klassenvariablen und Klassenmethoden
 * Finale Klassen und Konstanten
 * Konstruktoren und Destruktoren
 *
 */

public class App {
    public static void main(String[] args) {

        Lebewesen[] lebewesen = new Lebewesen[3];//Datenreihe Array aus Objekt der Klasse Lebewesen erzeugt
        // Hund erschaffen und kann mit der Zuweisung ihrer Objektvariablen beginnen
        lebewesen[0] = new Hund("Leroy", 17.0, 0.75);// zuweisung der Datentypen für den Konstruktor
        lebewesen[0].isst();//aufruf des Objektes lebewesen und der Methode isst
        lebewesen[0].isst();
        lebewesen[0].isst();
        System.out.println(lebewesen[0].getName());//ausgabe vom Objekt Array lebewesen getName von der Klasse Lebewesen
        System.out.println(lebewesen[0].getGewicht());
        System.out.println(lebewesen[0].getGroesse());
        double bmi0 = BMIRechner.rechne(lebewesen[0]);//Klassenmethode rechner aufrufen
        System.out.printf("%.2f", bmi0);// auf zwei dezimalzahlen gerundet
        System.out.println();
        System.out.println(//verkürzte anweisung if-else(?-:)Konstante der BMIRechner Klasse
                bmi0 >= BMIRechner.BMI_MAX ? "Übergewichtig" : bmi0 <= BMIRechner.BMI_MIN ?
                        "Untergewichtig" : "Normalgewichtig");
        System.out.println();


        lebewesen[1] = new Hund("Terry", 16, 0.73);
        lebewesen[1].isst();
        ((Hund) lebewesen[1]).spielt();//Casting Typ-umwandlung
        ((Hund) lebewesen[1]).spielt();
        System.out.println(lebewesen[1].getName());
        System.out.println(lebewesen[1].getGewicht());
        System.out.println(lebewesen[1].getGroesse());
        double bmi1 = BMIRechner.rechne(lebewesen[1]);//klassenmethode rechner aufrufen
        System.out.printf("%.2f", bmi1);// auf zwei dezimalzahlen gerundet
        System.out.println();
        System.out.println(
                bmi1 >= BMIRechner.BMI_MAX ? "Übergewichtig" : bmi1 <= BMIRechner.BMI_MIN ?
                        "Untergewichtig" : "Normalgewichtig");
        System.out.println("Zähler: " + BMIRechner.zaehler);//ausgabe der Klassenvariable zaehler von der Klasse BMIRechner
    }
}

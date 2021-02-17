package Skiverleih;


/***
 * Fachladen: Schiausrüstung
 * Wir besitzen ein Fachladen für Schiausrüstung. Unsere Kunden (Customer) können bei uns (Shop)
 * vorbeischauen, ein Verkäufer (SalesPerson) suchen. Ein Verkäufer kann die Kunde beraten,
 * Reservierungen anlegen und reservierte Ausrüstung ausgeben. Natürlich haben unsere Kunden die
 * Möglichkeit auf die Webseite (WebSite) zu informieren und reservieren.
 * Wenn ein Produkt vermietet ist, wird in Laden nicht mehr erreichbar sein. Falls die Kunde die
 * Schiausrüstung zurückbringt wird, wieder zur Verfügung stehen. Reservierte Ausrüstungen bleiben in
 * Laden, aber die sind nur für die Person auszugeben, der die Reservierung durchgeführt hat
 * Erstelle eine Simulation:
 * 1. Fachladen
 * Das Fachladen hat 10 Helme, 10 Stöcke, 10 Schischuhen, 10 Schutzbrillen, 10 Schi,… im Laden
 * 2. Kunden
 * Es gibt 30 Kunden. Jede Kunde kann eine oder mehrere Produkte ausleihen.
 * Jede Kunde hat eine Liste der Kategorien, was alles ihm fehlt. (Was er suchen und entleihen
 * soll)
 * 3. Wenn eine Kunde noch nichts reserviert oder gemietet hat, hat er 3% Chance dass er in
 * Laden kommt, er hat weitere 7% Chance, dass er auf die Webseite etwas sucht und reserviert
 * 4. Wenn eine Kunde etwas reserviert, wird innerhalb den nächsten 5 Simulationsrunden die
 * Ware abholen. Wenn der Kunde nicht alle Produktkategorien findet, wird er alle Produkte
 * sofort zurückgeben und das Laden verlassen
 * 5. Wenn eine Kunde alle für ihm notwendige Ausrüstungstücke zusammen hat, fährt er auf die
 * Schipiste. Er wird nach 10 Simulationsrunden alles zurückgeben. (Damit wird er wieder in der
 * Lage neue Reservierungen abgeben)
 */

public class Main {
    public static void main(String[] args) {

        Simulation sim = new Simulation();

        System.out.println("Wilkommen beim "+Shop.getInstance().getName());


        for (int i = 0; i < 1; i++) {
            sim.run();

        }
    }
}

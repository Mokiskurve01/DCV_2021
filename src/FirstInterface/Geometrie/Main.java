package FirstInterface.Geometrie;

public class Main {
    public static void main(String[] args) {

        //1.1.Erstellung einzelner Objekte
        IGeometrisch rechteck = new Rechteck(10, 20);
        IGeometrisch dreieck = new RechtwinkligesDreieck(10, 20);

        //1.2.Separate Berechnung des Flächeninhalt
        System.out.println("Rechteckfläche: " + rechteck.berechneFlaecheninhalt());
        System.out.println("Dreieckfläche: " + dreieck.berechneFlaecheninhalt());

        //2.1.Parameter für die Übergabe an GeometrischerRechner
        IGeometrisch[] figuren = new IGeometrisch[]{rechteck, dreieck};

        //2.2.Berechnung und Ausgabe der Gesamtfläche
        System.out.println("Gesamtfläche: " + GeometrischerRechner.berechneGesamtFlaecheninhalt(figuren));


        //region Variante1
        Rechteck rechteck1 = new Rechteck();
        RechtwinkligesDreieck dreieck1 = new RechtwinkligesDreieck();
        double flaeche = rechteck1.laengeMalHoehe(11, 20);
        double flaecheDreieck = dreieck1.laengeMalHoehe(11, 20);


        System.out.println(flaeche);
        System.out.println(flaecheDreieck);
        IGeometrisch[] figuren1 = new IGeometrisch[]{rechteck1, dreieck1};
        System.out.println(GeometrischerRechner.berechneGesamtFlaecheninhalt1(figuren1));
        //endregion
    }
}

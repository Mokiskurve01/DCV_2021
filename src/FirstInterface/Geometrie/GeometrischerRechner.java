package FirstInterface.Geometrie;

public class GeometrischerRechner {

    public static double berechneGesamtFlaecheninhalt(IGeometrisch[] figuren) {
        double ergebnis = 0;
        for (IGeometrisch figur : figuren) {
            ergebnis += figur.berechneFlaecheninhalt();
        }
        return ergebnis;
    }

    //region Variante1
    public static double berechneGesamtFlaecheninhalt1( IGeometrisch[] figuren1) {
        double ergebnis=0;
        for (IGeometrisch figur : figuren1) {
            ergebnis += figur.berechneFlaecheninhalt();
        }
        return ergebnis;
    }
    //endregion

}

package FirstInterface.Geometrie;

public class RechtwinkligesDreieck extends BasisFigur {

    //Konstruktor
    public RechtwinkligesDreieck(double laenge, double hoehe) {
        super(laenge, hoehe);
    }

    @Override
    public double berechneFlaecheninhalt() {
        return (getLaenge() * getHoehe()) / 2;
    }

    //region Variante1
    //Konstruktor Überladung ohne Parameter/get Methode
    public RechtwinkligesDreieck() {
        super();
    }

    //Berechnung und Überladung der Abstracten BasisFigur Klasse (eines RechtwinkligesDreieck)
    public double laengeMalHoehe(double laenge, double hoehe) {
        return super.laengeMalHoehe(laenge, hoehe) / 2;
    }
    //endregion


}

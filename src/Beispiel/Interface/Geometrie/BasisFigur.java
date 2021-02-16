package Beispiel.Interface.Geometrie;

public abstract class BasisFigur implements IGeometrisch {

    double laenge;
    double hoehe;

    //Konstruktor
    public BasisFigur(double laenge, double hoehe) {
        this.laenge = laenge;
        this.hoehe = hoehe;
    }

    public BasisFigur() {
    }

    public double getLaenge() {
        return laenge;
    }

    public double getHoehe() {
        return hoehe;
    }

    //region Variante1
    //Berechnung für ein Rechteck
    public double laengeMalHoehe(double laenge, double hoehe) {
        return laenge * hoehe;
    }
    //endregion
}

package FirstInterface.Geometrie;

public class Rechteck extends BasisFigur {

    //Konstruktor
    public Rechteck(double laenge, double hoehe) {
        super(laenge, hoehe);
    }

    @Override
    public double berechneFlaecheninhalt() {
        return getLaenge() * getHoehe();
    }

    //region Variante1
    public Rechteck() {
        super();
    }
    //endregion
}

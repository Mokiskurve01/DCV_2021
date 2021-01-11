package JavaGrundkurs1;

public class Fisch extends Lebewesen {
    public void isst() {
        super.gewicht += 0.001;
    }
//polymorphie ist, wenn in unterschiedlichen Klassen verschieden implementierungen haben beispiel Hund-Fisch
    public void isst(double menge) {
        super.gewicht += menge;
    }

}

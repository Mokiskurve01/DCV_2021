package JavaGrundkurs1;

public class Lebewesen {//ist die Vaterklasse von Hund/Fisch

    private String name;//Objektvariable
    protected double gewicht;
    private double groesse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    //Überladen -zwei gleichbenante Methoden sind erlaub wenn sie sich zb durch die Übergabeparameter unterscheiden
    public void isst() {//diese Methode ist eigentlich nicht nötig, wird im hintergund automatisch erzeugt
    }
    public void isst(double menge) {//Methode mit Übergabeparameter

    }
}

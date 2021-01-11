package JavaGrundkurs1;

public class Hund extends Lebewesen {//Erbe der Vaterklasse Lebewesen mittels extends

    public Hund(){//Konstruktor
        super();
        System.out.println("Der Hund wird erstellt");
    }

    public Hund(String name,double gewicht, double groesse){//Konstruktor mit Datentypen
        super();
        super.setName(name);
        super.setGewicht(gewicht);
        super.setGroesse(groesse);
    }
    public void finalize(){
        System.out.println("Der Hund wird entfernd");
    }//Destruktoren wird sehr sellten verwendet

    private Ball ball;//Deklariere Objekt Variable ball

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public void isst() {
        super.gewicht += 0.1;
    }//Methode gwicht bezieht sich durch super auf die Vaterklasse

    public void isst(double menge) {
        super.gewicht += menge;
    }//Methode

    public void spielt() {
        super.gewicht -= 0.1;
    }//Methode

}

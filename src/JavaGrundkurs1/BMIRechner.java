package JavaGrundkurs1;

public class BMIRechner {
    public static int zaehler;//Deklarieren einer Klassenvariable mittels static definiert
    public static final double BMI_MAX = 30.0;//Konstante erzeugt mit final
    public static final double BMI_MIN = 22.5;

    public static double rechne(Lebewesen lebewesen) {//lebewesen objekt deklarieren+Klassenvariable mittels static definiert
        double bmi = lebewesen.getGewicht() / (lebewesen.getGroesse() * lebewesen.getGroesse());//rechne
        zaehler++;
        return bmi;//Ergebnis als Rückgabewert
    }
}

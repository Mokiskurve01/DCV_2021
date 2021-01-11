package JavaGrundkurs2;

public class BMIRechner {
    public final static double BMI_MAX = 25;
    public final static double BMI_MIN = 18;
    public final static int MAX_Anzahl = 100;

    public String pruefe(Lebewesen lebewesen) {
        double bmi = lebewesen.getGewicht() / (lebewesen.getGroesse() * lebewesen.getGroesse());
        String ergebnisse = null;
        if (bmi <= BMI_MAX) {
            ergebnisse = "Übergewichtig";
        } else if (bmi < BMI_MIN) {
            ergebnisse = "Untergewichtig";

        } else {
            ergebnisse = "Normalgewichtig";
        }
        return ergebnisse;
    }
}

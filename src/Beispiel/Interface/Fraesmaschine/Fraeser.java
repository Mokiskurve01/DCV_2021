package Beispiel.Interface.Fraesmaschine;

/***
 * Die Wahl der Schnittgeschwindigkeit hängt im Wesentlichen von der Zusammensetzung und Festigkeit des zu bearbeitenden Werkstoffes,
 * der Zähigkeit und Härte des eingesetzten Schneidstoffes sowie der gewünschten Maßgenauigkeit und Oberflächengüte ab.
 */
public abstract class Fraeser implements IBearbeitungsZentrum {

    private String nameWerkzeug;
    private double werkzeugDurchmesser;
    private double schnittgeschwindichkeit;
    private boolean arbeitsEbeneXYAcshe;

    public Fraeser(String nameWerkzeug, double werkzeugDurchmesser, double schnittgeschwindichkeit, boolean arbeitsEbeneXYAcshe) {
        this.nameWerkzeug = nameWerkzeug;
        this.werkzeugDurchmesser = werkzeugDurchmesser;
        this.schnittgeschwindichkeit = schnittgeschwindichkeit;
        this.arbeitsEbeneXYAcshe = arbeitsEbeneXYAcshe;
    }

    @Override
    public double berechneSpindeldrehzahl() {
        return (schnittgeschwindichkeit * 1000) / (3.14 * werkzeugDurchmesser);
    }

    public void print() {
        System.out.println("Werzeug: " + nameWerkzeug + " ist für die Arbeitsebene X und Y geeignet: " + arbeitsEbeneXYAcshe);
        System.out.printf("Die Drehzahl der Spindel sollte %.0f Umdrehungen in der Minute betragen.", berechneSpindeldrehzahl());//Alias double ohne kommazahl
        System.out.println();
    }
}

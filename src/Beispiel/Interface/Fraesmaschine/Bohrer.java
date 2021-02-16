package Beispiel.Interface.Fraesmaschine;

public class Bohrer extends Fraeser {
    public Bohrer(String nameWerkzeug, double werkzeugDurchmesser, double schnittgeschwindichkeit, boolean arbeitsEbeneXYAcshe) {
        super(nameWerkzeug, werkzeugDurchmesser, schnittgeschwindichkeit, arbeitsEbeneXYAcshe);

        print();
    }
}

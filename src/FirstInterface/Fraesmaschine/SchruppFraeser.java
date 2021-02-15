package FirstInterface.Fraesmaschine;

public class SchruppFraeser extends Fraeser {

    public SchruppFraeser(String nameWerkzeug, double werkzeugDurchmesser, double schnittgeschwindichkeit, boolean arbeitsEbeneXYAcshe) {
        super(nameWerkzeug, werkzeugDurchmesser, schnittgeschwindichkeit, arbeitsEbeneXYAcshe);

        print();

    }
}

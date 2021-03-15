package Fraesmaschine1.Fraesmaschine;

public class Fraeswerkzeug {

    private String name;
    private int durchmesser;
    private  double vorschubProZahn;
    private int schneideanzahl;
    

    public Fraeswerkzeug(String name, int durchmesser, double vorschubProZahn, int schneideanzahl) {
        this.name = name;
        this.durchmesser = durchmesser;
        this.vorschubProZahn=vorschubProZahn;
        this.schneideanzahl=schneideanzahl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurchmesser() {
        return durchmesser;
    }

    public double getVorschubProZahn(){return vorschubProZahn;}

    public int getSchneideanzahl(){return schneideanzahl;}


}

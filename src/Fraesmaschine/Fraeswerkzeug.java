package Fraesmaschine;

public class Fraeswerkzeug {

    private String name;
    private int durchmesser;
    //private double vorschub;

    public Fraeswerkzeug(String name, int durchmesser) {
        this.name = name;
        this.durchmesser = durchmesser;

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




}

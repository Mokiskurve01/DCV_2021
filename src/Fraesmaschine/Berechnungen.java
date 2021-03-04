package Fraesmaschine;

public class Berechnungen {

    public int drehzahl(Schnittgeschwindichkeit schnittgeschwindichkeit,Fraeswerkzeug fraeswerkzeug) {
        int s = (int) ((schnittgeschwindichkeit.getVc() * 1000) / (Math.PI* fraeswerkzeug.getDurchmesser()));
        return s;
    }

}

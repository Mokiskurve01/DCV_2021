package Fraesmaschine;

public class Berechnungen {

    //Drehzahl(s)=(Vc*1000)/(PI*Ø)
    public int drehzahl(Schnittgeschwindichkeit schnittgeschwindichkeit, Fraeswerkzeug fraeswerkzeug) {
        int s = (int) ((schnittgeschwindichkeit.getVc() * 1000) / (Math.PI * fraeswerkzeug.getDurchmesser()));
        return s;
    }
    //Vorschub(f)= Drehzal*Vorschub-pro-Umdrehung
    public double vorschub(Schnittgeschwindichkeit schnittgeschwindichkeit, int drehzahl) {
        int f = (int) (drehzahl*schnittgeschwindichkeit.getF());
        return f;
    }
}

package Fraesmaschine1.Fraesmaschine;

public class Berechnungen {

    //Drehzahl(s)=(Vc*1000)/(PI*Ø)
    public int drehzahl(Schnittgeschwindichkeit schnittgeschwindichkeit, Fraeswerkzeug fraeswerkzeug) {
        int s = (int) ((schnittgeschwindichkeit.getVc() * 1000) / (Math.PI * fraeswerkzeug.getDurchmesser()));
        return s;
    }
    //Vorschub(f)= Drehzal*VorschubProZahn*Zaehnezahl
    public double vorschub(Fraeswerkzeug fraeswerkzeug,int drehzahl) {
        int f = (int) (drehzahl* fraeswerkzeug.getVorschubProZahn()* fraeswerkzeug.getSchneideanzahl());
        return f;
    }
}

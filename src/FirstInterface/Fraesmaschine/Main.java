package FirstInterface.Fraesmaschine;

public class Main {
    public static void main(String[] args) {

        SchruppFraeser spFr = new SchruppFraeser("Schrupp Fraeser", 12, 120, true);
        Bohrer HMBoh=new Bohrer("Hartmetall Bohrer",10,90,false);
        Bohrer GewBoh=new Bohrer("Gewinde Bohrer",6,15,false);

        spFr.berechneSpindeldrehzahl();
        HMBoh.berechneSpindeldrehzahl();
        GewBoh.berechneSpindeldrehzahl();
    }
}

package Fotoapparat;

public class Speicherkarte {
    private String marke;
    private double speichergroesse;
    private double belegtenSpeicherplatz;
    private double einFoto;
    public static int zaehler;

    public Speicherkarte(String marke, double speichergroesse, double belegtenSpeicherplatz, double einFoto,int zaehler) {
        this.marke = marke;
        this.speichergroesse = speichergroesse;
        this.belegtenSpeicherplatz = belegtenSpeicherplatz;
        this.einFoto = einFoto;
        this.zaehler = zaehler;

    }

    public static double machFoto(Speicherkarte speicherkarte) {
        double neuerSpeicher = speicherkarte.getBelegtenSpeicherplatz() + speicherkarte.getEinFoto();
        zaehler++;
        return neuerSpeicher;
    }


    public static double loescheFoto(Speicherkarte speicherkarte) {
        double neuerSpeicher = speicherkarte.getBelegtenSpeicherplatz() - speicherkarte.getEinFoto();
        zaehler--;
        return neuerSpeicher;
    }


    public double getBelegtenSpeicherplatz() {
        return belegtenSpeicherplatz;
    }

    public void setBelegtenSpeicherplatz(double belegtenSpeicherplatz) {
        this.belegtenSpeicherplatz = belegtenSpeicherplatz;
    }

    public double getEinFoto() {
        return einFoto;
    }


    @Override
    public String toString() {
        return " Speicherkarte der Marke: " + marke + " - Speichergroesse: " + speichergroesse + " MB" + " - ein Foto: " + einFoto + " MB" +
                "\n   Belegter Speicherplatz: " + belegtenSpeicherplatz + " MB" +
                "\n    Anzahl Fotos " + zaehler + " Stück" + "\n     Freier Speicher " + (100 - (100 / speichergroesse * belegtenSpeicherplatz)) + "%";
    }
}

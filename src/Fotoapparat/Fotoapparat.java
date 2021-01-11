package Fotoapparat;

public class Fotoapparat {
    private String marke;

    public Fotoapparat(String marke) {
        this.marke = marke;
    }

    @Override
    public String toString() {
        return "FotoApparat der Marke: " + marke;
    }
}

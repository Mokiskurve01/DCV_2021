package Beispiel.Interface.Geschaeft;

public class Kreditkarte implements IZahlung {
    @Override
    public void erzeugeZahlung() {
        System.out.println("Zahlung mit Kreditkarte");

    }
}

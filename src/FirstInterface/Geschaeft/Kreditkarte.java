package FirstInterface.Geschaeft;

public class Kreditkarte implements IZahlung {
    @Override
    public void erzeugeZahlung() {
        System.out.println("Zahlung über Kerditkarte");
    }
}

package FirstInterface.Geschaeft;

public class Bitcoin implements IZahlung {
    @Override
    public void erzeugeZahlung() {
        System.out.println("Zahlung über Bitcoin");

    }
}

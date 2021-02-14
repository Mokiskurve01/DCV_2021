package FirstInterface.Geschaeft;

public class PayPal implements IZahlung {
    @Override
    public void erzeugeZahlung() {
        System.out.println("Zahlung mit PayPal");
    }
}

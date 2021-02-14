package FirstInterface.Geschaeft;

public abstract class Shop {
    private String name;
    private IZahlung zahlungsart;

    public Shop(String name, IZahlung iz) {
        this.name = name;
        this.zahlungsart = iz;
    }

    public void zahlung() {
        zahlungsart.erzeugeZahlung();
    }
}

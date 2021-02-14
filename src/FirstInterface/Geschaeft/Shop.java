package FirstInterface.Geschaeft;

public class Shop {
    private final String name;
    private final IZahlung zahlungsart;

    public Shop(String name, IZahlung iz)//iz argument Interface
    {
        this.name = name;
        this.zahlungsart = iz;

    }

    public String getName() {
        return name;
    }

    public void zahlen() {
        System.out.println("Geschäft: " + getName());
        zahlungsart.erzeugeZahlung();
    }
}

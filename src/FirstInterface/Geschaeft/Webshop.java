package FirstInterface.Geschaeft;

public class Webshop extends Shop {

    public Webshop(String name, IZahlung iz, double betrag, double gebuehr) {
        super(name, iz, betrag, gebuehr);
    }
}

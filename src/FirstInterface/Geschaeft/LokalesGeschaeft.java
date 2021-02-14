package FirstInterface.Geschaeft;

public class LokalesGeschaeft extends Shop {

    public LokalesGeschaeft(String name, IZahlung iz, double betrag, double gebuehr) {
        super(name, iz, betrag, gebuehr);
    }
}

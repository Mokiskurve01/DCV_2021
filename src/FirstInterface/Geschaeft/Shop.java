package FirstInterface.Geschaeft;

public abstract class Shop {
    private final String name;
    private final IZahlung zahlungsart;
    private final double betrag;
    private final double gebuehr;

    public Shop(String name, IZahlung iz, double betrag, double gebuehr) {
        this.name = name;
        this.zahlungsart = iz;
        this.betrag = betrag;
        this.gebuehr = gebuehr;
    }

    public void zahlung() {
        System.out.println("Shop: "+getName());
        zahlungsart.erzeugeZahlung();
        double prozent=getBetrag()/100*gebuehr;
        System.out.println("Gesamtpreis: "+(getBetrag()+prozent)+" €");

    }

    public String getName() {
        return name;
    }

    public double getBetrag() {
        return betrag;
    }
}

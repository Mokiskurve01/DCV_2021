package FirstInterface.Geschaeft;

public abstract class Shop {
    private String name;
    private IZahlung zahlungsart;
    private double betrag;
    private double gebuehr;

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

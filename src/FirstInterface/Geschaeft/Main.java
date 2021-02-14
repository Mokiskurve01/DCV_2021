package FirstInterface.Geschaeft;

public class Main {
    public static void main(String[] args) {

        Webshop shop1 = new Webshop("Shop1", new PayPal());
        Webshop shop2 = new Webshop("Shop2", new Bitcoin());
        Webshop shop3 = new Webshop("Shop3", new Kreditkarte());

        shop1.zahlung();
        shop2.zahlung();
        shop3.zahlung();
    }
}

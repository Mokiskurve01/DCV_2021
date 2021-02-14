package FirstInterface.Geschaeft;

public class Main {
    public static void main(String[] args) {

        Webshop shop1 = new Webshop("Webshop", new PayPal(),100,3);
        LokalesGeschaeft shop2 = new LokalesGeschaeft("Lokales Geschäft", new Bitcoin(),100,1);
        JahrMarkt shop3 = new JahrMarkt("Jahr Markt", new Kreditkarte(),100,2);


        shop1.zahlung();
        System.out.println();
        shop2.zahlung();
        System.out.println();
        shop3.zahlung();
    }
}

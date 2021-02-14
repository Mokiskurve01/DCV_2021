package FirstInterface.Geschaeft;

public class Main {
    public static void main(String[] args) {

        Shop shop1=new Shop("Webshop",new PayPal());
        Shop shop2=new Shop("Lokales Geschäft",new Bitcoin());
        Shop shop3=new Shop("Jahr Markt",new Kreditkarte());

        shop1.zahlen();
        System.out.println();
        shop2.zahlen();
        System.out.println();
        shop3.zahlen();

    }
}

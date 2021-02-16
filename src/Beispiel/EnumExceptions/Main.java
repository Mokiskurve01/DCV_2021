package Beispiel.EnumExceptions;

public class Main {
    public static void main(String[] args) {

        for (var item : Category.values()) {
            try {
                System.out.println(item.name() + " kostet " + item.getPreis());
            } catch (ItemUnknownPriceException e) {
                System.err.println("Fehler bei Pricing: " + e.getMessage());
            }
           // finally { System.out.println("dieser Block wird immer ausgeführt"); }
        }
    }
}

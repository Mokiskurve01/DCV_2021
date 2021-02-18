package Beispiel.EnumExceptions;

public class Main {
    public static void main(String[] args) {
        for (var category : Category.values()) {
            try {
                System.out.println(category.name() + " kostet " + category.getPreis());
            } catch (ItemUnknownPriceException e) {
                System.err.println("Fehler bei Pricing: " + e.getMessage());
            } finally {
                System.out.println("dieser Block wird immer ausgeführt");
            }
        }
    }
}
package Beispiel.EnumExceptions;

public class ItemUnknownPriceException extends Exception {
    public ItemUnknownPriceException(Category item) {
        super(item.name() + " hat keinen Preis hinterlegt!");
    }
}

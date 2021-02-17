package Skiverleih;

public enum Kategorie {
    HELMET(12),
    SHOES(20),
    GLASSES(8),
    SKI(34);

    private final int price;

    Kategorie(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
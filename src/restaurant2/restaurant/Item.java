package restaurant2.restaurant;

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Auf der Karte: "+ name;
    }
}

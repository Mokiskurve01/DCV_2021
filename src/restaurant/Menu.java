package restaurant;


import java.util.Vector;

public class Menu {
    private String name;
    private Vector<Item>itemList;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Karte: " + name;
    }
}

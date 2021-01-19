package restaurant1.restaurant;


import java.util.Vector;

public class Menu {
    private String menuName;
    private Vector<Item> itemList;

    public Menu(String menuName, Vector<Item> itemList) {
        this.menuName = menuName;
        this.itemList = itemList;
    }
}

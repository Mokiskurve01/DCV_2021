package restaurant1.restaurant;

public class Item {
    private String itemName;
    private String type;

    public Item(String itemName, String type) {
        this.itemName = itemName;
        this.type = type;
    }

    public String getItemName() {
        return itemName;
    }

    public String getType() {
        return type;
    }
}

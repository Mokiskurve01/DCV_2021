package restaurant2.restaurant;

import java.util.Vector;

public class Restaurant {
    private String restaurantName;
    private Vector<Table> tableList;
    private Vector<Guestgroup> guestList;

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }


}

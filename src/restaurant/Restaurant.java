package restaurant;

import java.util.Vector;

public class Restaurant {
    private String restaurantName;
    private Vector<Table> tableList;
    private Vector<Guestgroup> guestList;

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public String toString() {
        return "Restaurant Name: " + restaurantName;
    }

    public void perfectTable(Guestgroup guestgroup, Table table) {
        if (table.getCapacity() == guestgroup.getGuestgroupSize()) {
            table.setAvailabale(true);
        }else if (table.getCapacity()>= guestgroup.getGuestgroupSize())  {
        } else table.setAvailabale(false);
    }
}

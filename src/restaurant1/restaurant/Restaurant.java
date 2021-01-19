package restaurant1.restaurant;

import java.util.Vector;

public class Restaurant {
    private String restaurantName;
    private Vector<Guestgroup> guestList;
    private Vector<Table> tableList;

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
        this.tableList = new Vector<>();
    }

//    public Table searchOrCreateTable(String tableName, int tableSize, boolean isAvailable) {
//        for (int i = 0; i < tableList.size(); i++) {
//            if (tableList.get(i).getTableName().equals(tableName)) {
//                return tableList.get(i);
//            }
//        }
//        Table t = new Table(tableName);
//        tableList.add(t);
//        return t;
//    }

    public boolean freeTable(Guestgroup guestgroup, Table table) {
        if (table.getIsAvailable() && (guestgroup.getGroupSize() <= table.getCapacity())) {
            System.out.println("There is a free table available.");
            return true;
        } else {
            System.out.println("There is no free table available.");
            return false;
        }
    }

}





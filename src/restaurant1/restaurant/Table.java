package restaurant1.restaurant;

public class Table {
    private String tableName;
    private int capacity;
    private boolean isAvailable;

    public Table(String tableName, int capacity, boolean isAvailable) {
        this.tableName = tableName;
        this.capacity = capacity;
        this.isAvailable = isAvailable;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getTableName() {
        return tableName;
    }
}


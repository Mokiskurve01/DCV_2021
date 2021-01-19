package restaurant;

public class Table {
    private String tableNumber;
    private int capacity;//sitzplätze
    private boolean availabale;

    public Table(String tableNumber, int capacity, boolean availabale) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.availabale = availabale;
    }

    @Override
    public String toString() {
        return "Tisch Nummer " + tableNumber +
                ": Sitzplätze " + capacity +
                ": Verfügbar " + availabale;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAvailabale() {
        return availabale;
    }

    public void setAvailabale(boolean availabale) {
        this.availabale = availabale;
    }
}


package restaurant2.restaurant;

public class Table {
    private String tableNumber;
    private int capacity;//sitzplätze
    private boolean availabale;

    public Table(String tableNumber, int capacity, boolean availabale) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.availabale = availabale;
    }

    public void erhöhung(int e){
        capacity+=e;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean besetzt(){
        availabale=false;
        return availabale;
    }

    public boolean isAvailabale() {
        return availabale;
    }



}


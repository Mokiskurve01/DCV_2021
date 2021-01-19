package restaurant1.restaurant;



public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Harry's Beiz");

        Table table1 = new Table("Table 1", 4, true);
        Table table2 = new Table("Table 2", 2, true);
        Table table3 = new Table("Table 3", 6, true);

        Guestgroup group1 = new Guestgroup("Group1", 2);
        Guestgroup group2 = new Guestgroup("Group2", 3);
        Guestgroup group3 = new Guestgroup("Group3", 7);

        restaurant.freeTable(group1, table2);
    }
}

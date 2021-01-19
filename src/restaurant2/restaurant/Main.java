package restaurant2.restaurant;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {


        Vector tableList = new Vector();
        Table table1 = new Table("1", 2, true);


        Vector guestList = new Vector();
        Guestgroup guestgroup1 = new Guestgroup("Familie Mayer", 2);
        Guestgroup guestgroup2 = new Guestgroup("Firma Lercher", 4);


        tableList.add(table1);

        guestList.add(guestgroup1);
        guestList.add(guestgroup2);

        System.out.println(table1.getCapacity());
        table1.erhöhung(3);
        System.out.println(table1.getCapacity());

        System.out.println(table1.isAvailabale());
        table1.besetzt();
        System.out.println(table1.isAvailabale());


    }
}

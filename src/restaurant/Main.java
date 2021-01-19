package restaurant;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        //Objekte erzeugen
        Restaurant restaurant = new Restaurant("Harry´s Beiz");

        Vector tableList = new Vector();
        Table table1 = new Table("1", 2, true);
        Table table2 = new Table("2", 4, true);
        Table table3 = new Table("3", 6, true);

        Vector guestList = new Vector();
        Guestgroup guestgroup1 = new Guestgroup("Familie Mayer", 2);
        Guestgroup guestgroup2 = new Guestgroup("Firma Lercher", 4);
        Guestgroup guestgroup3 = new Guestgroup("Faschingszunft Sibratsgfäll", 4);

        Menu menu = new Menu("Speisekarte");

        Vector itemList = new Vector();
        Item drink = new Item("Getränk");
        Item starter = new Item("Vorspeise");
        Item mainCourse = new Item("Hauptspeise");
        Item dessert = new Item("Nachspeise");
        //einfügen der Objekte in Vector
        tableList.add(table1);
        tableList.add(table2);
        tableList.add(table3);
        guestList.add(guestgroup1);
        guestList.add(guestgroup2);
        guestList.add(guestgroup3);
        itemList.add(drink);
        itemList.add(starter);
        itemList.add(mainCourse);
        itemList.add(dessert);

        //Ausgabe der gesamten Objekte
       /* System.out.println(restaurant.toString());
        for (int i = 0; i < tableList.size(); i++) {
            System.out.println(tableList.elementAt(i));
        }
        for (int i = 0; i < guestList.size(); i++) {
            System.out.println(guestList.elementAt(i));
        }
        System.out.println(menu.toString());
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.elementAt(i));
        }

        if (table1.isAvailabale()) {
            for (int i = 0; i < tableList.size(); i++) {
                if (((Table) tableList.elementAt(i)).isAvailabale()) {
                    restaurant.perfectTable(guestgroup2, (Table) tableList.elementAt(i));
                    System.out.println("Tisch Nummer " + ((Table) tableList.elementAt(i)).getTableNumber() +
                            " ist für die " + guestgroup2.getName() + " frei!");
                    i = tableList.size();

                }
            }
        } else {
            System.out.println("Zur Zeit ist leider kein Tisch frei");
        }*/

        System.out.println(tableList.elementAt(1));
    }
}

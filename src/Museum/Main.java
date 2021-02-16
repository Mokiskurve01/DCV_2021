package Museum;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Museum museum = new Museum(4, 15, 1, 1,
                "Bild1", "Bild2", "Bild3", "Bild4", "Bild5", "Bild6", "Bild7", "Bild8");

        var list = new Vector<Person>();
        for (int i = 0; i < 10; i++) {
            list.add(new Visitor());
        }

        list.add(5, new Thief());
        list.elementAt(1).getName();

        System.out.println(list);
        System.out.println(museum.getRooms());
    }

    private static void print(Museum museum) {
        for (Room r : museum.getRooms()) {
            for (Person p : r.getPersons()) {
                System.out.println(p);
            }
        }
    }
}

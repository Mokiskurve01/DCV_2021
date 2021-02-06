package museum3;

public class Main {
    public static void main(String[] args) {

        Museum museum = new Museum(4, 15, 1, 1,
                "Bild1", "Bild2", "Bild3", "Bild4", "Bild5", "Bild6", "Bild7","Bild8");

        for (Room r : museum.getRooms()) {
            for (Person p : r.getCopyOfPersons()) {
                p.move(museum);
            }
        }
        print(museum);
    }

    private static void print(Museum museum) {
        for (Room r : museum.getRooms()) {
            for (Person p : r.getPersons()) {
                System.out.println(p);
            }
        }
    }
}

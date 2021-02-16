package Museum;

public class Museum implements IValue{

    private Room[] rooms;

    //erzeugen von objekte
    public Museum(int numberOfRooms, int numberVisitors, int numberGuards, int numberThief, String... artworks) {
        rooms = new Room[numberOfRooms];
        for (int i = 0; i < numberOfRooms; i++) {//erzeuge die Räume
            rooms[i] = new Room();
        }
        for (int i = 0; i < numberVisitors; i++) {//erzeuge Besucher
            rooms[0].getPersons().add(new Visitor());
        }
        for (int i = 0; i < numberGuards; i++) {//erzeuge Wächter
            rooms[0].getPersons().add(new Guard());
        }
        for (int i = 0; i < numberThief; i++) {//erzeuge Diebe
            rooms[0].getPersons().add(new Thief());
        }

    }
    //end

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public int getIndexOfRoom(Person person) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPersons().contains(person)) {
                return i;
            }
        }
        return 6660;
    }
    public double getValue(){
        return 200;
    }
}

package Museum;

import java.util.Random;

public abstract class Person {
    protected boolean canLeave = false;
    private String name;
    protected static String[] listOfName = {"Hans", "Peter", "Albert", "Susi", "Gustaf", "Luki", "Alex"};

    public String getName() {
        if (name == "" || name == null) {
            Random random = new Random();
            name = listOfName[random.nextInt(listOfName.length)];
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void move(Museum museum) {
        int roomsAndExit = museum.getRooms().length + 1;//anzahl Räume im Museum+1(weil Ausgang)
        Random rand = new Random();
        int nextRoom = rand.nextInt(roomsAndExit);//bekommst den nächster Raum den die Peraon besucht

        while (!this.canLeave && nextRoom >= museum.getRooms().length) {
            //true wir neue zahl gesucht (nicht Ausgang)
            // Guard darf nicht zum Ausgang
            nextRoom = rand.nextInt(roomsAndExit);
        }

        if (nextRoom == museum.getIndexOfRoom(this)) {//bleibt im Raum weil der nächste Raum der gleiche ist
            return;
        }

        if (nextRoom < roomsAndExit) {//wenn er in den Räumen vom Museum bleibt
            museum.getRooms()[nextRoom].getPersons().add(this);//zufällige raum
        } else {

            System.out.println("Person verlässt das Museum!");
        }
        museum.getRooms()[museum.getIndexOfRoom(this)].getPersons().remove(this);//löscht Person aus dem Raum ist Raum
    }
}

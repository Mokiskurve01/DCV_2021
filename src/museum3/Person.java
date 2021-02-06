package museum3;

import java.util.Random;

public abstract class Person {
    protected boolean canLeave = false;

    @Override
    public String toString() {
        return "Person{" +
                "canLeave=" + canLeave +
                '}';
    }

    public void move(Museum museum) {
        int roomsAndExit = museum.getRooms().length + 1;//anzahl Räume im Museum+1(weil Ausgang)
        Random rand = new Random();
        int nextRoom = rand.nextInt(roomsAndExit);//bekommst den nächster Raum den die Peraon besucht

        while (this.canLeave==false&&nextRoom>=museum.getRooms().length){//Guard darf nicht zum Ausgang
            nextRoom = rand.nextInt(roomsAndExit);
        }

        if (nextRoom==museum.getIndexOfRoom(this)){//bleibt im Raum weil der nächste Raum der gleiche ist
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

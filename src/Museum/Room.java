package Museum;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        persons = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public ArrayList<Person> getCopyOfPersons() {
        return (ArrayList<Person>) persons.clone();
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
}

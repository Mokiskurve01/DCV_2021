package Beispiel.Interface.Lehrer;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Lehrer> lehrers = new Vector<>();
        lehrers.add(new Lehrer("Gyula", new German()));
        lehrers.add(new Lehrer("Dan", new English()));
        lehrers.add(new Lehrer("Alex", new Gsiberger()));

        for (Lehrer l : lehrers) {
            l.greeting();
        }
    }
}
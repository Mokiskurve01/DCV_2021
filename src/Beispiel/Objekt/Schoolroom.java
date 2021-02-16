package Beispiel.Objekt;

import java.util.Vector;

public class Schoolroom {

    private Vector<Child> children;

    public Schoolroom() {
        this.children = new Vector<>();
    }

    public void addChild(Child child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        return "Schoolroom{" +
                "children=" + children +
                '}';
    }
}

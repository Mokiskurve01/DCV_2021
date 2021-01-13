package Objekt;

public class Child {
    // Klassen sind Baupläne für Objekte (Entwicklungzeit)

    private String name;
    private Child bestFriend;

    public Child(String name) {
        this.name = name;
    }

    // Übergabe einer Referenz (Adresse) eines Child-Objekts
    public void setBestFriend(Child bestFriend) {
        this.bestFriend = bestFriend;
    }

    public void playWithBall(Ball ball) {
        System.out.println(name + " spielt mit dem " + ball);
    }

    @Override
    public String toString() {
        return name + ", bestFriend=" + bestFriend;
    }
}

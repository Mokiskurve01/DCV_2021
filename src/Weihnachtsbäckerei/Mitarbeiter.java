package Weihnachtsbäckerei;

public class Mitarbeiter {
    private String name;

    public Mitarbeiter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

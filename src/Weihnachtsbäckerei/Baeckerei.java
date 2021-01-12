package Weihnachtsbäckerei;

public class Baeckerei {
    private String name;

    public Baeckerei(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bäckerei Name: " + name;
    }
}

package Objekt;

public class Ball {

    private String color;

    public Ball(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " ball";
    }
}

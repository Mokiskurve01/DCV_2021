package Objekt;

import java.util.Vector;

public class ToyBox {

    private Vector<Ball> balls;

    public ToyBox() {
        this.balls = new Vector<>();
    }

    public void addBall(Ball ball) {
        this.balls.add(ball);
    }

    @Override
    public String toString() {
        return "In der ToyBox befinden sicht" + balls;
    }
}

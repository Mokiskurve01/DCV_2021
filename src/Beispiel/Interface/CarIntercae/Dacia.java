package Beispiel.Interface.CarIntercae;

public class Dacia implements ICar {
    @Override
    public void start() {
        System.out.println("Dacia starts");
    }

    @Override
    public void run() {
        System.out.println("Dacia is driving");
    }

    @Override
    public void stop() {
        System.out.println("Dacia stops");

    }
    public void toOvertake() {
        System.out.println("Dacia overtake Ferrari");
    }
}

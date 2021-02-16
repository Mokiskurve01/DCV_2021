package Beispiel.GetterMethodeKonstruktor;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Skoda", "Diesl", 50, 25);


        System.out.println(car.getCurrTankLevel());
        car.fillTank(8);
        System.out.println(car.getCurrTankLevel());
    }
}
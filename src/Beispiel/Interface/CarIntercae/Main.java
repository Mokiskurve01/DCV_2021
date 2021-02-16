package Beispiel.Interface.CarIntercae;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ICar ferrari = new Ferrari();
        ferrari.run();
        ferrari.stop();


        ICar dacia = new Dacia();
        dacia.start();
        //  new Dacia().toOvertake();//kan nur das Dacia
        ((Dacia) dacia).toOvertake();


        List<ICar> cars = new ArrayList<>();
        cars.add(ferrari);
        cars.add(dacia);
        System.out.println("--------------------");

        for (ICar car : cars) {
            car.run();
        }
        for (ICar c : cars) {
            c.stop();
        }
    }
}
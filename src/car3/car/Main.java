package car3.car;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Skoda", 20, 50, 150);
        Car car2 = new Car("Ducia", 50, 10, 150);

        PetrolStation petrolStation = new PetrolStation("Total", 0.95f);
        Garage garage = new Garage("Jet", 100, 20);

        Driver driver = new Driver("Hans", garage, car1);


        driver.drive(450, petrolStation);
        driver.setCar(car2);
        driver.drive(250, petrolStation);

    }
}
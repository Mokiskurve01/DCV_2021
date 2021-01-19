package car2.car;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("Hans");
        Car car = new Car("Skoda", "Diesl", 50, 25,15000,10000,20000,15000);
        Garage garage=new Garage("City Garage");
        PetrolStation petrolStation=new PetrolStation("Jet",1.5,1.0);

        System.out.println(car.getKmUntilService());
        car.resetServiceInterval();
        System.out.println(car.getKmUntilService());

        System.out.println(car.getRemainingTireKm());
        car.installNewTires();
        System.out.println(car.getRemainingTireKm());

        System.out.println(car.getCurrTankLevel());
        car.fillTank();
        System.out.println(car.getCurrTankLevel());

    }
}
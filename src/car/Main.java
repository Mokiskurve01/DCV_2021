package car;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("Hans");
        Car car = new Car("Skoda", "Diesl", 50, 25);
        Garage garage=new Garage("City Garage");
        PetrolStation petrolStation=new PetrolStation("Jet",1.5,1.0);





        System.out.println(car.getCurrTankLevel());
        car.fillTank(8);
        System.out.println(car.getCurrTankLevel());

    }
}
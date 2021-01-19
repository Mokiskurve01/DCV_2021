package car3.car;

public class Driver {

    private String name;
    private Car car;
    private Garage garage;

    public Driver(String name, Garage garage, Car car){
        this.name = name;
        this.garage = garage;
        this.car = car;
    }

    public Driver(String name, Garage garage){
        this.name = name;
        this.garage = garage;
        this.car = null;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void drive(int km, PetrolStation petrolStation){
        if ((car != null) && (garage != null) && (petrolStation != null)){
            car.drive(km, petrolStation, garage, this);
        } else {
            System.out.println(name + " muss heute mit Bus fahren, weil er/sie kein Auto, keine Tankstelle oder keinen Werkstatt hat.");
        }
    }

    public String getName() {
        return name;
    }
}

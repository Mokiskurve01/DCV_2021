package car2.car;

public class Car {

    private String name;
    private String fuelTyp;
    private int tankVolume;
    private int currTankLevel;//aktueller Stand
    private int tireMaxKm;//reifen max km
    private int remainingTireKm;//reifen verbleibender km
    private int serviceInterval;
    private int kmUntilService;//bis zum nächsten Service

    public Car(String name, String fuelTyp, int tankVolume, int currTankLevel, int tireMaxKm, int remainingTireKm, int serviceInterval, int kmUntilService) {
        this.name = name;
        this.fuelTyp = fuelTyp;
        this.tankVolume = tankVolume;
        this.currTankLevel = currTankLevel;
        this.tireMaxKm = tireMaxKm;
        this.remainingTireKm = remainingTireKm;
        this.serviceInterval = serviceInterval;
        this.kmUntilService = kmUntilService;
    }

    public void resetServiceInterval() {
        kmUntilService = serviceInterval;

    }
    public void installNewTires(){
        remainingTireKm=tireMaxKm;
    }

    public void fillTank(){
        currTankLevel=tankVolume;
    }

    public int getKmUntilService() {
        return kmUntilService;
    }

    public int getRemainingTireKm() {
        return remainingTireKm;
    }

    public int getCurrTankLevel() {
        return currTankLevel;
    }
}

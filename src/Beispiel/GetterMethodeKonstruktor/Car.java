package Beispiel.GetterMethodeKonstruktor;

public class Car {

    private String name;
    private String fuelTyp;
    private int tankVolume;
    private int currTankLevel;

    public Car(String name, String fuelTyp, int tankVolume, int currTankLevel) {
        this.name = name;
        this.fuelTyp = fuelTyp;
        this.tankVolume = tankVolume;
        this.currTankLevel = currTankLevel;
    }
    public void fillTank(int fill){
        currTankLevel+=fill;
    }

    public int getCurrTankLevel() {
        return currTankLevel;
    }
}

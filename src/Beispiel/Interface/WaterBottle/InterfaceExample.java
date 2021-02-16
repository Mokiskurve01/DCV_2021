package Beispiel.Interface.WaterBottle;

public class InterfaceExample implements IWaterBottle {
    public static void main(String[] args) {
        System.out.println(color);
        InterfaceExample ex=new InterfaceExample();
        ex.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("It is filled");
    }

    @Override
    public void pourOut() {

    }
}

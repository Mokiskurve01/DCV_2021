package Beispiel.Scanner;

public class Pizza {

   private String name;
   private int preis;

    public Pizza(String name, int preis) {
        this.name = name;
        this.preis =preis;
    }

    public String getName() {
        return name;
    }

    public int getPreis() {
        return preis;
    }

    public void preisTopping(int topping){
        preis+=topping;
    }
}

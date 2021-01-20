package pizzeria;
/***
 * wenn keine zahl beim scanner eingegeben wird kommt ein fehler (scanner.nextInt)
 * es könne fünf zutaten hinzugefügt werden ( problmen bei default zählt counter, methode addTopping bei default counter--)
 */

import java.util.Scanner;
import java.util.Vector;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Pizza pizza = new Pizza("Margherita", 6);
    static Topping topping = new Topping("Cheese", "Ham", "Pineapple", "Tomato", "Chili");//max 5 Zutaten definieren
    static Vector pizzaTopping = new Vector();//für die rechnung einen vector der zutaten auf der pizza

    public static void main(String[] args) {

        System.out.printf("Start with Pizza %s%n", pizza.getName() + "\nAmount " + pizza.getPreis() + " Euro.");
        boolean again = true;
        int counter = 0;
        while (again) {
            System.out.println();
            System.out.print("[1=Pizza topping 2=Bill]->");
            int select = scanner.nextInt();
            counter++;
            System.out.println("Noch "+(6-counter)+" Zutaten sind möglich!");
            if (select == 1) {
                addTopping();
            } else if (select == 2) {
                again = bill();
            } else {
                System.out.println("[Misentry]");
            }
            if (counter == 5) {
                again = bill();
            }
        }
        scanner.close();
        System.out.println("Program End");
    }

    private static boolean bill() {
        boolean again;
        System.out.println("Pizza " + pizza.getName() + ":Topping- " + pizzaTopping);
        System.out.println("It s " + pizza.getPreis() + " Euro.");
        again = false;
        return again;
    }

    private static void addTopping() {
        System.out.print("[1=" + topping.getTopping1() + " 2=" + topping.getTopping2() + " 3=" + topping.getTopping3() + " 4=" + topping.getTopping4() + " 5=" + topping.getTopping5() + "]->");
        int auswahl = scanner.nextInt();

        switch (auswahl) {
            case 1 -> {
                pizza.preisTopping(1);//methode preisZutaten + preisPizza
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getTopping1());
                Main.pizzaTopping.add(topping.getTopping1());//zutaten vector hinzufügen
            }
            case 2 -> {
                pizza.preisTopping(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getTopping2());
                Main.pizzaTopping.add(topping.getTopping2());
            }
            case 3 -> {
                pizza.preisTopping(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getTopping3());
                Main.pizzaTopping.add(topping.getTopping3());
            }
            case 4 -> {
                pizza.preisTopping(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getTopping4());
                Main.pizzaTopping.add(topping.getTopping4());
            }
            case 5 -> {
                pizza.preisTopping(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getTopping5());
                Main.pizzaTopping.add(topping.getTopping5());
            }
            default -> System.out.println("[Misentry]");
        }
    }
}

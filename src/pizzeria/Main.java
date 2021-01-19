package pizzeria;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Pizza pizza = new Pizza("Margherita", 6);
    static Topping topping = new Topping("Cheese", "Ham", "Pineapple", "Tomato", "Chili");
    static Vector pizzaTopping = new Vector();

    public static void main(String[] args) {

        System.out.printf("Start with Pizza %s%n", pizza.getName() + "\nAmount " + pizza.getPreis() + " Euro.");
        boolean again = true;
        int counter = 0;
        while (again) {
            System.out.println();
            System.out.print("[1=Pizza topping 2=Bill]->");
            int select = scanner.nextInt();
            counter++;
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
        System.out.println("Pizza: " + pizza.getName() + "-Topping: " + pizzaTopping);
        System.out.println("It s " + pizza.getPreis() + " Euro.");
        again = false;
        return again;
    }

    private static void addTopping() {
        System.out.print("[1=" + topping.getZutat1() + " 2=" + topping.getZutat2() + " 3=" + topping.getZutat3() + " 4=" + topping.getZutat4() + " 5=" + topping.getZutat5() + "]->");
        int auswahl = scanner.nextInt();

        switch (auswahl) {
            case 1 -> {
                pizza.preisZutat(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getZutat1());
                Main.pizzaTopping.add(topping.getZutat1());
            }
            case 2 -> {
                pizza.preisZutat(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getZutat2());
                Main.pizzaTopping.add(topping.getZutat2());
            }
            case 3 -> {
                pizza.preisZutat(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getZutat3());
                Main.pizzaTopping.add(topping.getZutat3());
            }
            case 4 -> {
                pizza.preisZutat(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getZutat4());
                Main.pizzaTopping.add(topping.getZutat4());
            }
            case 5 -> {
                pizza.preisZutat(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getZutat5());
                Main.pizzaTopping.add(topping.getZutat5());
            }
            default -> System.out.println("[Misentry]");
        }
    }
}

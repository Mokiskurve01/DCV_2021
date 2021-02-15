package pizzeria2;
/***
 * es könne fünf zutaten hinzugefügt werden ( problmen bei default zählt counter, methode addTopping bei default counter--)
 */

import java.util.Scanner;
import java.util.Vector;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Pizza pizza = new Pizza("Margherita", 6);
    static Topping topping = new Topping("Cheese", "Ham", "Pineapple", "Tomato", "Chili");//max 5 Zutaten
    static Vector<String> pizzaTopping = new Vector<String>();//Rechnung Vector Zutaten auf der Pizza

    public static void main(String[] args) {

        System.out.printf("Start with Pizza %s%n", pizza.getName() + "\nAmount " + pizza.getPreis() + " Euro.");
        boolean again = true;
        int counter = 5;
        while (again) {
            System.out.println();
            System.out.print("[1=Pizza topping 0=Bill]->");
            String select = scanner.next();
            select = select.substring(0, 1);
            counter--;
            System.out.println("Noch " + (counter) + " Zutaten sind möglich!");
            if (49 == ((int) select.charAt(0))) {
                addTopping();
            } else if (48 == ((int) select.charAt(0))) {
                again = bill();
            } else {
                System.out.println("[Error]");
            }
            if (counter == 0) {
                again = bill();
            }
        }
        scanner.close();
        System.out.println("Program End");
    }

    private static boolean bill() {
        boolean again;
        System.out.println("<--------------Bestellbestätigung--------------->");
        System.out.println("Pizza " + pizza.getName() + ":Topping- " + pizzaTopping);
        System.out.println("It s " + pizza.getPreis() + " Euro.");
        again = false;
        return again;
    }

    private static void addTopping() {
        System.out.print("[1=" + topping.getTopping1() + " 2=" + topping.getTopping2() + " 3=" + topping.getTopping3() + " 4=" + topping.getTopping4() + " 5=" + topping.getTopping5() + "]->");
        String auswahl = scanner.next();


        switch (auswahl) {
            case "1" -> {
                pizza.preisTopping(1);//methode preisZutaten + preisPizza
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getTopping1());
                Main.pizzaTopping.add(topping.getTopping1());//zutaten vector hinzufügen
            }
            case "2" -> {
                pizza.preisTopping(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getTopping2());
                Main.pizzaTopping.add(topping.getTopping2());
            }
            case "3" -> {
                pizza.preisTopping(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getTopping3());
                Main.pizzaTopping.add(topping.getTopping3());
            }
            case "4" -> {
                pizza.preisTopping(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getTopping4());
                Main.pizzaTopping.add(topping.getTopping4());
            }
            case "5" -> {
                pizza.preisTopping(1);
                System.out.println("Amount " + pizza.getPreis() + " Euro/ topping " + topping.getTopping5());
                Main.pizzaTopping.add(topping.getTopping5());
            }
            default -> System.out.println("[Error]");

        }
    }
}

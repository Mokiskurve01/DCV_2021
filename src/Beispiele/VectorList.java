package Beispiele;

import java.util.Vector;

public class VectorList {
    public static void main(String[] args) {

        String[] fruits = new String[3];
        fruits[0] = "Apple";
        fruits[1] = "Mango";
        fruits[2] = "Strawberry";
        System.out.println(fruits[0]);

        Vector<String> fruitList = new Vector<>();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");
        fruitList.remove("Apple");
        System.out.println(fruitList.contains("Banana"));

        System.out.println(fruitList);


    }


}

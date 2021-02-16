package Beispiele;

import java.util.Locale;

public class ReturnStatements {
    public static void main(String[] args) {
        printAMessage();
        add(5, 7);
        int sum = addReturn(5, 4);
        System.out.println(sum);
        String shouting = caps("why are you reading my diary mom?");
        System.out.println(shouting);
        int[] awesome = gimmeArrayOfInts(3, 5, 7);
        System.out.println(awesome[0]);
        System.out.println(awesome[1]);
        System.out.println(awesome[2]);
    }

    public static void printAMessage() {
        System.out.println("This is our first method");
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static int[] gimmeArrayOfInts(int a, int b, int c) {
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array;
    }


    public static int addReturn(int a, int b) {
        return a + b;
    }

    public static String caps(String s) {
        return s.toUpperCase(Locale.ROOT);
    }
}

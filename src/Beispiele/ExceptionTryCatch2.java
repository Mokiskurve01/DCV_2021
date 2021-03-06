package Beispiele;

import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTryCatch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // byte Wertbereich -128 bis 127
        try {
            System.out.print("Erste Nummer eingeben->");
            byte n1 = scanner.nextByte();
            System.out.print("Zweite Nummer eingeben->");
            byte n2 = scanner.nextByte();
            byte sum = (byte) (n1 / n2);

            System.out.println(sum);
        } catch (InputMismatchException ime) {
            System.out.println(ime.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
}

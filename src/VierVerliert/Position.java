package VierVerliert;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Position {

    String position;

    public String selectPosition() {
        System.out.print("Position [1-7] Eingabe->");
        try {
            Scanner scn = new Scanner(System.in);
            position = scn.next();

            boolean zahl = false;
            do {
                switch (position) {
                    case "1", "2", "3", "4", "5", "6", "7" -> {
                        zahl = true;
                        return position;
                    }
                }
            } while (zahl);
        } catch (InputMismatchException e) {
            System.out.println("Bitte geben eine gültige Zahl ein");
        }
        return position;
    }

    public String getPosition() {
        return position;
    }
}

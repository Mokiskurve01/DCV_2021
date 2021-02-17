package VierVerliert;

import java.util.Scanner;

public class Position {

    int position;

    public int selectPosition() {
        System.out.print("Position Eingabe->");
        Scanner scn = new Scanner(System.in);
        position = scn.nextInt();
        return position;
    }

    public int getPosition() {
        return position;
    }
}

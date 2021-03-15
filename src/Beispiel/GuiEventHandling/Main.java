package Beispiel.GuiEventHandling;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Fenster fenster = new Fenster();
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setSize(400, 200);
    }
}

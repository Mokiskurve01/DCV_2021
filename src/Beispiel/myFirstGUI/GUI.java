package Beispiel.myFirstGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JButton button;
    private JFrame frame;


    public GUI() {                                            //Konstruktor
        frame = new JFrame();

        button = new JButton("Click me");
        button.addActionListener(this);//methode actionPreformend wird durch das Klicken mit der Maus aufgerufem

        label = new JLabel(" Number of clicks:  0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
                                                             // absand zu den Kanten
        panel.setLayout(new GridLayout(0, 1));     // anzahl der Zeilen und Spalten
        panel.add(button);
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER);               //Zentriert das Layout des Fensters
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// min max und exit button rechts oben beim Fenster
        frame.setTitle("My GUI");
        //frame.setSize(500,500);                            // setzt das Fenster auf die eingegeben grösse
        frame.pack();                                        //passt das Fensters dar länge der Textes an
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: "+count);
    }
}

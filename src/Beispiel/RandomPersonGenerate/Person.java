package Beispiel.RandomPersonGenerate;

import java.util.Random;

public class Person {
    public String[] name = {"Alf", "Bine Maja", "Zesar", "Dumbo"};
    public String[] ort = {"Plante Melmak", "Blumenwiese", "Rom", "Walt Disney"};

    public String createPerson() {
        Random ran = new Random();
        String fName = name[ran.nextInt(name.length)];
        String WOrt= ort[ran.nextInt(name.length)];
        return "Name: "+fName+"\nWohnort: "+WOrt;
    }
}

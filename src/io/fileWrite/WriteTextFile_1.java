package io.fileWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile_1 {
    public static void main(String[] args) {
        int counter = 1;
        File myFile = null;
        String fileName = "Werkzeugtabelle";

        do {
           myFile = new File(getFileName("C:\\Users\\DCV\\Desktop\\", fileName, counter, ".txt"));
            System.out.println("Prüfung ob die Datei: " + myFile.getAbsolutePath() + ": exestiert? " + myFile.exists());
            ++counter;
        } while (myFile.exists());
        System.out.println("Neue Datei wird hier gespeichert"+myFile.getAbsolutePath());//speicher Ort
        try {
            FileWriter fw = new FileWriter(myFile, false);
            fw.write("Schaftfraeser Schrupp ; Ø12");//in die Datei schreiben
            fw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static String getFileName(String speicherOrt, String name, int counter, String dateiArt) {
        if (counter == 1) {//kein file vorhanden wird ohne counter gespeichert
            return speicherOrt + name + dateiArt;
        }
        return speicherOrt + name + (counter - 1) + dateiArt; //file mit counter
    }
}

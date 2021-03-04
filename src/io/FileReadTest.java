package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadTest {
    public static void main(String[] args) {

        List<Data> people = new ArrayList<>();
        File file = new File("./testdata/people.txt");//Relative(bezug auf meinen aktuellen Standort)./eine Ordner vor-../einen Ordner zurück
        try {
            FileReader fileReader = new FileReader(file);//FileReader Zeichen für Zeichen eingelesen
            BufferedReader bufferedReader = new BufferedReader(fileReader);//BufferedReader Zeile für Zeile;

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineArray = line.split(";");
                Data person = new Data(lineArray[0], lineArray[1], lineArray[2]);
                people.add(person);
            }
            for (Data person : people) {
                System.out.println(person);
            }

           /* int charakter;
            while ((charakter = fileReader.read()) != -1) {
                System.out.print(Character.toString(charakter));
            }
            */

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

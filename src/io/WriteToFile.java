package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\DCV\\IdeaProjects\\DCV_2021\\src\\io\\newFile.txt");
           // /Users/DCV/Desktop/covid19.txt
            myWriter.write("Hier kommt der Text");
            myWriter.close();
            System.out.println("Erfolgreich");
        } catch (IOException e) {
            System.out.println("Fehlgeschlagen");
            e.printStackTrace();
        }
    }
}

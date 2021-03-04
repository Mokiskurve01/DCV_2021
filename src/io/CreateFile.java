package io;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {//C:\Users\DCV\IdeaProjects\DCV_2021\src\Covid19Auswertung
            File myFile = new File("C:\\Users\\DCV\\IdeaProjects\\DCV_2021\\src\\io\\newFile.txt");
            if (myFile.createNewFile()) {
                System.out.println("Create File" + myFile.getName());
            } else {
                System.out.println("File exists");
            }
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}

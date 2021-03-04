package io.fileWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteTextFile {

    int count = 1;

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {


        Path pfade = Paths.get("../../Desktop");//Relative Pfade Aktuellen Ordner zwei mal zurück /Desktop
        Path fileName = pfade.resolve("Hello World.txt");//Datei Name

        try {
            System.out.println(Files.exists(fileName));//exestiert die Datei

            writeTextToFile(fileName, "Hello Mars");//Methode schreibe in die Datei
           // writeNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeNewFile(Path fileName, Path pfade, String text) throws IOException {
        if (Files.exists(pfade)) {
            writeTextToFile(pfade, text);
        } else {

           /* Path fileName1 = pfade.resolve("Hello World" + Integer.toString(1) + ".txt");
            fileName = fileName1;
            writeTextToFile(pfade, text);

            */
        }
    }

    private static void writeTextToFile(Path path, String text) throws IOException {
        FileWriter fw = new FileWriter(String.valueOf(path));
        fw.write(text);
        fw.append("\nund wieder zurück");
        fw.close();
    }
}

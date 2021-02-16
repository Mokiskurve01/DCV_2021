package Beispiele;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/***
 * http://textfiles.com/100/captmidn.txt
 */

public class FileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/DCV/Desktop/captmidn.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "THIS IS A NEW FILE MADE BY US--";

        while (scan.hasNextLine())
            //System.out.println(scan.nextLine());//schreibe in die cosole-ausblenden zeile 17,22,23,24,25

        fileContent = fileContent.concat(scan.nextLine() + "\n");
        FileWriter writer = new FileWriter("/Users/DCV/Desktop/newfile.txt");
        writer.write(fileContent);
        writer.close();

    }
}

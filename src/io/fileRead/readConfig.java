package io.fileRead;
/***
 * 1. Liest der Config File
 * 2. Auflistet alle eingestellte Parameter (ein HashMap ist zu verwenden)
 *
 * C:\Users\DCV\IdeaProjects\DCV_2021\testdata\config_1.txt
 * C:\Users\DCV\IdeaProjects\DCV_2021\testdata\config_2.txt
 * C:\Users\DCV\IdeaProjects\DCV_2021\testdata\config_3.txt
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class readConfig {
    public static void main(String[] args) throws IOException {

        int counter = 0;
        for (int i = 0; i < 1; i++) {
            counter++;
            System.out.println("----------------------->" + counter + "<-------------------------------");
            String[] path1 = new String[6];
            path1[0] = "C:\\Users\\DCV\\IdeaProjects\\DCV_2021\\testdata\\config_1.txt";
            path1[1] = "C:\\Users\\DCV\\IdeaProjects\\DCV_2021\\testdata\\config_2.txt";
            path1[2] = "C:\\Users\\DCV\\IdeaProjects\\DCV_2021\\testdata\\config_3.txt";

            HashMap<String, String> config = new HashMap<String, String>();
            File file = new File(path1[0]);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                var lineSplit = line.split(";");
                config.put(lineSplit[0].trim(), lineSplit[1].trim());
                System.out.println(config);
            }
        }
    }
}

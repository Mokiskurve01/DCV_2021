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


public class readConfig1 {
    public static void main(String[] args) throws IOException {

        String[] path1 = new String[6];
        HashMap<String, String> hashMap = new HashMap<>();
        path1[0] = "C:\\Users\\DCV\\IdeaProjects\\DCV_2021\\testdata\\config_1.txt";

        File file = new File(path1[0]);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        var lineSplit=line.split(";");
        System.out.println(line+" /gesamte erste Zeile");
        System.out.println(lineSplit[0]+lineSplit[1]+" /String [] über split(;) getrennt");
        System.out.println(lineSplit[0]);
        System.out.println(lineSplit[1]);
        hashMap.put(lineSplit[0],lineSplit[1]+"hashMap zugefügt");

        System.out.println(hashMap);


    }
}

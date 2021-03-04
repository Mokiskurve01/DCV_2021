package io.fileRead;
/***
 * Erstelle ein Programm:
 * 1. Liest aus Console eine Dateiname
 * 2. Liest das File und schreibt den Inhalt auf Console
 *
 * C:\Users\DCV\IdeaProjects\DCV_2021\testdata\testfile_1.txt
 * C:\Users\DCV\IdeaProjects\DCV_2021\testdata\testfile_2.txt
 * C:\Users\DCV\IdeaProjects\DCV_2021\testdata\testfile_3.txt
 *
 */


import java.io.*;
import java.nio.charset.Charset;

import java.util.Scanner;


public class readTestFile {
    public static void main(String[] args) throws IOException {

         /*  Scanner scan = new Scanner(System.in);
            System.out.print("Eingabe->");
            String path = scan.next();
           */

        String[] path1 = new String[3];
        path1[0] = "C:\\Users\\DCV\\IdeaProjects\\DCV_2021\\testdata\\testfile_1.txt";
        path1[1] = "C:\\Users\\DCV\\IdeaProjects\\DCV_2021\\testdata\\testfile_2.txt";
        path1[2] = "C:\\Users\\DCV\\IdeaProjects\\DCV_2021\\testdata\\testfile_3.txt";


        for (int i = 0; i < path1.length; i++) {
            System.out.println("------------------------" + (i+1) + " -------------------------------");

            File file = new File(path1[i]);
            FileReader fileReader = new FileReader(file, Charset.forName("UTF-8"));
            FileReader fileReader1 = new FileReader(file, Charset.forName("ISO-8859-2"));//für das testfile_3

            BufferedReader bufferedReader = new BufferedReader(fileReader1);
            String line;
            while ((line = bufferedReader.readLine()) != null) {//zeile für zeile bis null
                System.out.println(line);

            }
        }

    }
}

//"Hochwasserbeständige Spiegelbohrmaschine"
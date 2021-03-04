package Covid19_1;

import java.io.*;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Vector<BufferedReader> dataList = new Vector<>();
        File file = new File("C:\\Users\\DCV\\IdeaProjects\\DCV_2021\\src\\Covid19_1\\input\\covid19.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        dataList.add(bufferedReader);


        System.out.println(dataList.elementAt(0).toString());
    }
}
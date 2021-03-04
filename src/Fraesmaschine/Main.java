package Fraesmaschine;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\DCV\\Desktop\\Werkzeugtabelle.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        var splitLine = line.split(";");

        String[] werkzeugName = new String[splitLine.length];
        int[] werkzeugDurchmesser = new int[splitLine.length];
       // double[] werkzeugVorschub = new double[splitLine.length];

        werkzeugName[0] = splitLine[0].trim();
        werkzeugDurchmesser[0] = Integer.parseInt(splitLine[1].trim());
       // werkzeugVorschub[0] = Double.parseDouble(splitLine[2].trim());

        Fraeswerkzeug fraeswerkzeug=new Fraeswerkzeug(werkzeugName[0],werkzeugDurchmesser[0]);
        Berechnungen berechnungen =new Berechnungen();

        System.out.println(fraeswerkzeug.getName()+" Drehzahl: "+berechnungen.drehzahl(Schnittgeschwindichkeit.SCHRUPPFRAESER,fraeswerkzeug )+" U/min");


    }
}

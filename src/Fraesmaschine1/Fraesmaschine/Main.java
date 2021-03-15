package Fraesmaschine1.Fraesmaschine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //region Einlesen des File
        String path = "C:\\Users\\DCV\\Desktop\\Werkzeugtabelle.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //endregion
        //region Anzahl der Zeilen und Dauer
        long l = System.currentTimeMillis(); // Systemzeit merken => Dauer berechnen!
        int count = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));

            while (in.readLine() != null) {
                count++;
            }
            System.out.println("Anzahl der Zeilen: " + count);
            System.out.println("Dauer des lesen: " + (System.currentTimeMillis() - l)); // Dauer ausgeben.
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //endregion des

        String line;
        while ((line = bufferedReader.readLine()) != null) {//Zeile für Zeile bis null
            var splitLine = line.split(";"); //Trenne in ein Array mittels (regex)";"
            System.out.println(line);

                String werkzeugName = splitLine[0].trim();
                int werkzeugDurchmesser = Integer.parseInt(splitLine[1].trim());
                double vorschubProZahn = Double.parseDouble(splitLine[2].trim());
                int schneideanzahl = Integer.parseInt(splitLine[3].trim());

            Fraeswerkzeug fraeswerkzeug = new Fraeswerkzeug(werkzeugName, werkzeugDurchmesser, vorschubProZahn, schneideanzahl);
            Berechnungen berechnungen = new Berechnungen();
            int drehzahl;
            if (werkzeugName.contains("Schlicht")){
                drehzahl = berechnungen.drehzahl(Schnittgeschwindichkeit.SCHLICHTFRAESER, fraeswerkzeug);
            }else {
                drehzahl = berechnungen.drehzahl(Schnittgeschwindichkeit.SCHRUPPFRAESER, fraeswerkzeug);
            }

            int vorschub = (int) berechnungen.vorschub(fraeswerkzeug, drehzahl);
            System.out.println(fraeswerkzeug.getName()
                    + " : Drehzahl= " + drehzahl + " U/min - Vorschub= " + vorschub + " mm/min");
        }
    }
}

package Fotoapparat;

public class Main {

/***
 * Problem
 * loeschen von vielen fotos!!
 * Anzahal von Fotos für jede Speicherkarte
 */

    /***
     * Aufgabe
     * Erstellt nun ähnlich wie das “Objektiv” eine Klasse welche die Speicherkarte abbildet. Der
     * “FotoApparat” hat eine Eigenschaft die die Speicherkarte darstellt.
     * Die Speicherkarte sollte eine Marke, eine Speichergröße und einen belegten Speicherplatz
     * beinhalten.
     * Sollte mit der Methode “machFoto” auf dem “FotoApparat” ein Foto geschossen werden, so
     * verlieren wir 5 MB an Speicherplatz. Daher wäre es fein, wenn ich über einen getter
     * herausfinden kann, wie viel Speicherplatz noch frei ist (Prozent) und über einen separaten
     * getter wieviel Fotos ich noch schießen kann.
     * Tauscht die Speicherkarten aus und schießt Fotos auf beide Karten, am Ende gebt ihr aus
     * wie viel bei beiden Karten noch verfügbar ist.
     * Zusatz: Sollte der Speicherplatz eng werden, wäre eine Option zum löschen von einer
     * Anzahl x an Fotos noch praktisch.
     */

    public static void main(String[] args) {

        Fotoapparat fotoApparat = new Fotoapparat("Canon");
        System.out.println(fotoApparat);

        Speicherkarte speicherkarte[] = new Speicherkarte[2];
        speicherkarte[0] = new Speicherkarte("Sony", 100, 0, 5, 0);
        speicherkarte[1] = new Speicherkarte("SanDisk", 555, 115, 7, 0);
        System.out.println(speicherkarte[0]);


        speicherkarte[0].setBelegtenSpeicherplatz(Speicherkarte.machFoto(speicherkarte[0]));
        speicherkarte[0].setBelegtenSpeicherplatz(Speicherkarte.machFoto(speicherkarte[0]));
        speicherkarte[0].setBelegtenSpeicherplatz(Speicherkarte.machFoto(speicherkarte[0]));
        speicherkarte[0].setBelegtenSpeicherplatz(Speicherkarte.machFoto(speicherkarte[0]));
        speicherkarte[0].setBelegtenSpeicherplatz(Speicherkarte.machFoto(speicherkarte[0]));
        System.out.println(speicherkarte[0].toString());

        speicherkarte[1].setBelegtenSpeicherplatz(Speicherkarte.machFoto(speicherkarte[1]));
        speicherkarte[1].setBelegtenSpeicherplatz(Speicherkarte.machFoto(speicherkarte[1]));
        speicherkarte[1].setBelegtenSpeicherplatz(Speicherkarte.machFoto(speicherkarte[1]));
        System.out.println(speicherkarte[1].toString());

        speicherkarte[0].setBelegtenSpeicherplatz(Speicherkarte.loescheFoto(speicherkarte[0]));
        speicherkarte[0].setBelegtenSpeicherplatz(Speicherkarte.loescheFoto(speicherkarte[0]));
        speicherkarte[0].setBelegtenSpeicherplatz(Speicherkarte.loescheFoto(speicherkarte[0]));
        System.out.println(speicherkarte[0].toString());

        speicherkarte[1].setBelegtenSpeicherplatz(Speicherkarte.loescheFoto(speicherkarte[1]));
        speicherkarte[1].setBelegtenSpeicherplatz(Speicherkarte.loescheFoto(speicherkarte[1]));
        System.out.println(speicherkarte[1].toString());
    }
}

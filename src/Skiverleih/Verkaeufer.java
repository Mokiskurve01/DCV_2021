package Skiverleih;

import java.util.List;

public class Verkaeufer implements IAnbieter {
    private final String vorname;
    private final String nachname;
    private List<Produkt> produkte;

    public Verkaeufer(String vor, String nach) {
        vorname = vor;
        nachname = nach;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void pickUp(Reserviert reserviert) {

    }

    @Override
    public boolean verfuegbar(Kategorie kategorie, List<Produkt> produkte) {
        produkte = Shop.getInstance().getProdukte();

        for (Produkt produkt : produkte) {
            if (produkt.getKategorie().equals(kategorie) && produkt.getVerfuegbar()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Reserviert reserviert(Kategorie kategorie, List<Produkt> produkts) {
        for (Produkt produkt : produkts) {
            if (produkt.getKategorie().equals(kategorie) && produkt.getVerfuegbar()) {
                produkt.setVerfuegbar(false);
                return null;
            }
        }
        return null;
    }
}
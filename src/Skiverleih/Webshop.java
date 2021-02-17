package Skiverleih;

import java.util.List;

class WebShop implements IAnbieter {

    private static WebShop instance;

    private WebShop() {
    }

    public static WebShop getInstance() {
        if (instance == null) {
            instance = new WebShop();
        }
        return instance;
    }

    @Override
    public boolean verfuegbar(Kategorie kategorie, List<Produkt> produkts) {

        for (Produkt produkt : produkts) {
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
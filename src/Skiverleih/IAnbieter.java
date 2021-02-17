package Skiverleih;

import java.util.List;

public interface IAnbieter {

    boolean verfuegbar(Kategorie kategorie, List<Produkt> produkts);

    Reserviert reserviert(Kategorie kategorie, List<Produkt> produkts);

}

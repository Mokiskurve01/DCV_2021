package Skiverleih;

import java.util.List;

public class Shop {

    private static Shop instance;
    private final String name = "Skiverleih Mooserwirt";
    private final WebShop webShop = WebShop.getInstance();
    private final List<Verkaeufer> verkaeufers = SimulationFactory.herstellenVerkaeufer(1);
    private List<Produkt> produkts = SimulationFactory.herstellenProdukte(10);

    private Shop() {
    }

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public WebShop getWebShop() {
        return this.webShop;
    }

    public Verkaeufer getVerkaeufer() {
        return this.verkaeufers.get(0);
    }

    public List<Produkt> getProdukte() {
        return produkts;
    }

    public void setProdukte(List<Produkt> produkts) {
        this.produkts = produkts;
    }
}
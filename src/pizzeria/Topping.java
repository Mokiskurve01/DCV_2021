package pizzeria;

public class Topping {
    private String zutat1;
    private String zutat2;
    private String zutat3;
    private String zutat4;
    private String zutat5;

    public Topping(String zutat1, String zutat2, String zutat3, String zutat4, String zutat5) {
        this.zutat1 = zutat1;
        this.zutat2 = zutat2;
        this.zutat3 = zutat3;
        this.zutat4 = zutat4;
        this.zutat5 = zutat5;
    }

    public String getZutat1() {
        return zutat1;
    }

    public String getZutat2() {
        return zutat2;
    }

    public String getZutat3() {
        return zutat3;
    }

    public String getZutat4() {
        return zutat4;
    }

    public String getZutat5() {
        return zutat5;
    }
}

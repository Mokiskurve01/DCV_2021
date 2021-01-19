package car3.car;

public class Car {

    private String marke;
    private float benzinStand;
    private int kmServiceRest;
    private int kmReifenRest;

    public Car(String marke, float benzinStand, int kmServiceRest, int kmReifenRest){
        this.marke = marke;
        this.benzinStand = benzinStand;
        this.kmServiceRest = kmServiceRest;
        this.kmReifenRest = kmReifenRest;
    }

    public void drive(int km, PetrolStation petrolStation, Garage garage, Driver driver){
        System.out.println(marke + " fährt.");
        for (int i=km; i > 0; --i){
            benzinStand -= (0.05f * 1);
            kmServiceRest -= 1;
            kmReifenRest -= 1;
            if (benzinStand <= 2){
                tanken(50, petrolStation, driver);
            }
        }
        System.out.println(marke + " ist " + km + " gefahren und aktuell ist " + String.format("%.2f", benzinStand) +
                " Liter Benzin im Tank.");
        if (kmServiceRest <= 0){
            garage.service(this, driver);
        }
    }

    public void tanken(int liter, PetrolStation petrolStation, Driver driver){
        benzinStand += liter;
        System.out.println(
                driver.getName() +
                        " tankt " +
                        marke +
                        " mit " +
                        liter +
                        " Liter Benzin für " +
                        liter*petrolStation.getPreisProLiter() +
                        "€\n" +
                        "   Aktuell sind " +
                        String.format("%.2f", benzinStand) +
                        " Liter Benzin im Tank.");
    }

    public String getMarke() {
        return marke;
    }

    public int getKmReifenRest() {
        return kmReifenRest;
    }

    public void setKmReifenRest(int kmReifenRest) {
        this.kmReifenRest = kmReifenRest;
    }

    public void setKmServiceRest(int kmServiceRest) {
        this.kmServiceRest = kmServiceRest;
    }
}

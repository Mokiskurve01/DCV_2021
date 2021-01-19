package car3.car;

public class Garage {

    private String name;
    private int kostenReifenwechseln;
    private int kostenService;

    public Garage(String name, int kostenReifenwechseln, int kostenService){
        this.name = name;
        this.kostenReifenwechseln = kostenReifenwechseln;
        this.kostenService = kostenService;
    }

    public Garage(String name){
        this.name = name;
        kostenReifenwechseln = 100;
        kostenService = 20;
    }

    public void service(Car car, Driver driver){
        System.out.println(car.getMarke()+" Servie");
        if (car.getKmReifenRest() < 0) {
            System.out.println("  Reifen werden gewechselt.");
            car.setKmReifenRest(40000);
            System.out.println("  " + driver.getName() + " bezahlt für Service inkl. Reifenwechsel: " + (kostenService+kostenReifenwechseln)+"€");
        } else {
            System.out.println("  " + driver.getName() + " bezahlt für Service: "+kostenService+"€");
        }
        car.setKmServiceRest(18500);
    }
}

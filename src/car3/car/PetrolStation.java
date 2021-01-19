package car3.car;

public class PetrolStation {

    private String name;
    private float preisProLiter;

    public PetrolStation(String name, float preisProLiter){
        this.name = name;
        this.preisProLiter = preisProLiter;
    }

    public float getPreisProLiter() {
        return preisProLiter;
    }
}

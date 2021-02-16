package Museum;

public class Thief extends Person implements IValue{
    @Override
    public double getValue() {
        return 200;
    }
}

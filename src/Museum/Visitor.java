package Museum;

public class Visitor extends Person implements IValue{
    protected boolean canLeave = true;


    @Override
    public double getValue() {
        return 100;
    }
}

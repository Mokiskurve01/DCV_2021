package Museum;

import java.util.Comparator;

public class MuseumsCompare implements Comparator<IValue> {

    @Override
    public int compare(IValue o1, IValue o2) {
        if (o1.getValue() > o2.getValue()) {
            return -1;
        }
        if (o1.getValue() < o2.getValue()) {
            return 1;
        }
        return 0;
    }
}

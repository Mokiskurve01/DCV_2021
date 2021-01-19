package restaurant1.restaurant;

public class Guestgroup {


    private String groupName;
    private int groupSize;

    public Guestgroup(String groupName, int groupSize) {
        this.groupName = groupName;
        this.groupSize = groupSize;
    }

    public int getGroupSize() {
        return groupSize;
    }
}


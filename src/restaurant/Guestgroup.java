package restaurant;

public class Guestgroup {

    private String name;
    private int guestgroupSize;

    public Guestgroup(String name, int guestgroupSize) {
        this.name = name;
        this.guestgroupSize = guestgroupSize;
    }

    @Override
    public String toString() {
        return "Gruppename "+ name +
                ": Gruppengrösse " + guestgroupSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuestgroupSize() {
        return guestgroupSize;
    }

    public void setGuestgroupSize(int guestgroupSize) {
        this.guestgroupSize = guestgroupSize;
    }
}


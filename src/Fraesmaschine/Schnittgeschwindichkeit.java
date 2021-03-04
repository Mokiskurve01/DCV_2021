package Fraesmaschine;

public enum Schnittgeschwindichkeit {

    SCHRUPPFRAESER(120);

    private final int vc;

    Schnittgeschwindichkeit(int vc) {
        this.vc = vc;
    }

    public int getVc() {
        return vc;
    }
}

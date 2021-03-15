package Fraesmaschine;

public enum Schnittgeschwindichkeit {

    SCHRUPPFRAESER(120,0.05);

    private final int vc;
    private final double f;


    Schnittgeschwindichkeit(int vc, double f) {
        this.vc = vc;
        this.f = f;
    }

    public int getVc() {
        return vc;
    }

    public double getF() {
        return f;
    }
}

package Fraesmaschine1.Fraesmaschine;

public enum Schnittgeschwindichkeit {

    SCHRUPPFRAESER(120),
    SCHLICHTFRAESER( 80);

    private final int vc;


    Schnittgeschwindichkeit(int vc) {
        this.vc = vc;
    }

    public int getVc() {
        return vc;
    }

}

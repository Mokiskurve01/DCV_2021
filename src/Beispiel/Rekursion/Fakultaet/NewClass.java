package Beispiel.Rekursion.Fakultaet;

public class NewClass {
    public int fak(int b) {
        if (b == 1) return 1;
        return b * fak(b - 1);
    }
}

package Beispiele;

public class MethodeReturn {

    public static double berechneGesamtPreis(double stueckPreis, int stueckZahl) {
        if (stueckZahl >= 1000) {
            return gibPreisNachlass(stueckPreis, stueckZahl);
        } else {
            return stueckPreis * stueckZahl;
        }
    }

    public static double gibPreisNachlass(double stueckPreis, int stueckZahl) {
        return stueckPreis * stueckZahl - (stueckPreis * 0.02 * stueckZahl);
    }

    public static void main(String[] args) {
        System.out.println(berechneGesamtPreis(100, 1000));

    }
}

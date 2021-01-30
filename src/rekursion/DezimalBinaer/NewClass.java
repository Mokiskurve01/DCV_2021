package rekursion.DezimalBinaer;

public class NewClass {
    public void printBinary(int b) {
        if (b > 0) {
            printBinary(b / 2);
            System.out.printf("%d", b % 2);
        }
    }
}

package rekursion.GGT;

public class NewClass {
    public int ggt(int a ,int b) {
        int temp = a;
        if (a < b) {
            a = b;
            b = temp;
        }
        if (b==0)return a;
        return ggt(b,(a%b));
    }
}

package rekursion.Potenz;

public class NewClass {

    public double power(double x, int n) {
        double y;
        if (n == 0)
            return 1.0;
        y = power(x, n / 2);
        y = y * y;
        if (n % 2 == 0)
            return y;
        return x * y;
    }
}

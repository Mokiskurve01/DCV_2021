package rekursion.Fibonacci;

public class NewClass {
    public int fibunacci(int num) {
        if (num == 1 || num == 2)
            return 1;
        return fibunacci(num - 1) + fibunacci(num - 2);
    }
}

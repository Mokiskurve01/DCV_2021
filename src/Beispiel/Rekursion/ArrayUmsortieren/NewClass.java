package Beispiel.Rekursion.ArrayUmsortieren;

public class NewClass {
    public void reserve(int[] numbers) {
        if (numbers.length == 0) {
            return;
        } else {
            int[] a = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                a[i] = numbers[i + 1];
            }
            reserve(a);
            System.out.print(numbers[0] + " ");
        }
    }
}

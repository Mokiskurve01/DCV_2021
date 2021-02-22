package Beispiele;

public class ExceptionTryCatch1 {
    public static void main(String[] args) {

        try {
             int[] a = null;//1
            //int[] a = {4};//2
            System.out.println(a[1]);
        } catch (NullPointerException e) {//1
            System.out.println("Dein Array ist null!");
        } catch (ArrayIndexOutOfBoundsException e) {//2
            System.out.println("Index außerhalb der Grenzen!");
        }
    }
}

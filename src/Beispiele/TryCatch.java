package Beispiele;

public class TryCatch {
    public static void main(String[] args) {

        try {
           // int[] a = null;//1
            int[] a = {4};//2
            System.out.println(a[1]);

        } catch (NullPointerException e) {//1

            System.out.println("Your array is null!");

        } catch (ArrayIndexOutOfBoundsException e) {//2

            System.out.println("Your index is out of bounds!");

        } catch (Exception e) {

            System.out.println("Something else went wrong!");

        }
    }
}

package Beispiele;

public class Methods {
    public static void main(String[] args) {
        welcom();
        divide(10,5);
        divide(111,11);
        multipy(5,10);
        multipy(3,7);
        multipy(7,15);
    }
    public static void welcom(){
        System.out.println("Welcome to calculator!");
    }
    public static void divide(int a,int b){
        System.out.println(a/b);
    }
    public static void multipy(int a,int b){
        System.out.println(a*b);
    }
}

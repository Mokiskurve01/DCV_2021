package Beispiel.ClassAttributes;

public class Main {
    public static void main(String[] args) {

        String firstName = "John";
        String secondName = "Smith";
        int age = 35;
        int roomNumber = 204;

        Customer customer=new Customer();
        customer.saveCustomerInfo(firstName,secondName,age,roomNumber);
    }
}

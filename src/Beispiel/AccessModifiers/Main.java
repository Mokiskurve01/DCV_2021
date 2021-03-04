package Beispiel.AccessModifiers;

public class Main {
    public static void main(String[] args) {
        Worker worker1 =new Worker();
        worker1.setName("James");
        worker1.setSalary(200000);

        Worker worker2=new Worker();
        worker2.setName("Tom");
        worker2.setSalary(150000);

        System.out.println(CalculateTotalSalary(worker1,worker2));
    }
    static int CalculateTotalSalary(Worker worker1,Worker worker2){
        int sum= worker1.getSalary()+ worker2.getSalary();
        return sum;
    }


}

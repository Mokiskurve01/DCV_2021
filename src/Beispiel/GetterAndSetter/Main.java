package Beispiel.GetterAndSetter;

public class Main {
    public static void main(String[] args) {
        String name ="James";
        int age=26;

        Student student=new Student();
        student.name=name;
        student.setAge(age);

        System.out.println("Name: "+ student.name);
        System.out.println("Age: "+student.getAge());
    }


}

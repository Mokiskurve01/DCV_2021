package Beispiel.GetterAndSetter;

public class Student {

    public String name;
    private int age;

    public int getAge() {
        if (age < 0) {
            age = 0;
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0) {
            System.out.println("Invalid age");
        }
    }
}

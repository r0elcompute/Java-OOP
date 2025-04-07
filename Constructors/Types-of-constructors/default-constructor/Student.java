//this is a piece of code showcasing a default constructor in Java 

public class Student {

    String name;
    int age;
    String regno;

    //default constructor

    Student () {
        name = "Rodgers";
        age = 20;
        regno = "BTIT/088J/2024";
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Registration Number: " + student.regno);
    }
}

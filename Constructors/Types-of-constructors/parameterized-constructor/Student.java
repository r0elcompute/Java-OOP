//This code snippet illustrates parameterized constructors

public class Student {
    public int age;
    public String name;
    public String regno;

    //parameterized constructor
    //It takes parameters 

    Student(int age, String name, String regno) {
        this.age = age;
        this.name = name;
        this.regno = regno;
    }

    public static void main(String[] args) {
        //create an object using the new keyword
        Student student = new Student(20, "Rodgers", "BTIT/088J/2024");
        System.out.println("Age: " + student.age);
        System.out.println("Name: " + student.name);
        System.out.println("Registration Number: " + student.regno);
    }
}
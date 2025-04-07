public class Student1 {
    //Create a student class with three constructors 
    //default that sets name = "unknown" and age = 0;
    //parameterized that sets both name and age 
    //copy that copies values from another student object

    /*In the main method, create a student using the parameterized constructor
     * Create a second student using the copy constructor
     * print the name and age of both students
     */

    private String name;
    private int age;

    //default constructor
    Student1 () {
        this.name = "Unknown";
        this.age = 0;
    }

    //parameterized constructor
    Student1 (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //copy constructor
    Student1 (Student1 obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    public static void main(String[] args) {
        Student1 firstStudent = new Student1("Rodgers", 20);
        Student1 secondStudent = new Student1(firstStudent);
        
        System.out.print("Student 1 - Name: ");
        System.out.print(firstStudent.name + "\n");
        System.out.print("Age: ");
        System.out.print(firstStudent.age + "\n");
        System.out.print("Student 2 - Name: ");
        System.out.print(secondStudent.name + "\n");
        System.out.print("Age: ");
        System.out.print(secondStudent.age);
    }
}

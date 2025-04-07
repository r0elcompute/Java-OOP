public class Student {

    int age;

    //default constructor
    Student () {
        age = 20;
    }

    //copy constructor
    Student (Student obj) {
        System.out.println("copy constructor called");
        this.age = obj.age;
    }

    public static void main(String[] args) {
        Student student1 = new Student();//default constructor
        Student student2 = new Student(student1);//copy constructor
        System.out.println(student2.age);
    }

}

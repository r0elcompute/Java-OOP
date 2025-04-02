//This is a code illustrating the concept of classes in java 
//Classes are blueprints for creating objects 


public class Student {
    //These properties will remain unused for now

    int age;
    String name;
    String regno;

    //A method

    public void register() {
        System.out.println("You have been successfuly registered!");
    }

    //The main method(starting point for a java execution)

    public static void main(String[] args) {
        Student student = new Student();

        //you may choose to do whatever you need to with the newly created object
        //let us print out the method register 
        
        //call the method 
        student.register();
    }
}

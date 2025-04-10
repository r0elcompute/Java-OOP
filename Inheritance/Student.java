// INHERITANCE
/* It is the phenomenon where the superclass (parent) passes down attributes and behavior to 
 * its subclass (child).
 * We are going to use the keyword 'extends' for this.
 */

 class Student1 {
    void register() {
        System.out.println("You have successfully been registered!");
    }
}

class Student2 extends Student1 {
    void eat() {
        System.out.println("Your meal card has been successfully renewed!");
    }
}

public class Student {
    public static void main(String[] args) {
        // Create object from Student2 class
        Student2 student2 = new Student2();
        student2.register(); // inherited from Student1
        student2.eat();      // defined in Student2
    }
}

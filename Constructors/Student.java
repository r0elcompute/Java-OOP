//Constructors are special methods which are used to initialize objects
//Constructors have specific rules that apply to them
/*
 * 1.They take the same name as the class name
 * 2.They do not take return types such as void and int
 * 3.Their role is initializing objects
 * 4.You can define multiple constructors
 * 5.A default constructor is one without zero arguments and empty body
 * */


//Here is a code to illustrate a constructor method
//Constructors are of 3 types discussed in another folder

public class Student {
    public String name;
    public int age;
    public String regno;

    //A constructor method
    
    Student (String name, int age, String regno) {
        this.name = name;
        this.age = age;
        this.regno = regno;
    }

}

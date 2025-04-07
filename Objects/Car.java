
/* Objects in Java refer to instances of classes that are entities in the real world */
public class Car {
    public String brand;
    public String name;
    public String color;

    public static void main(String[] args) {
        //create an object
        Car car = new Car();

        //initialize variables
        car.brand = "Toyota";
        car.name = "Toyota SUV";
        car.color = "Red";

        //print out the values
        System.out.println("Brand: " + car.brand);
        System.out.println("Name: " + car.name);
        System.out.println("Color: " + car.color);


    }

}

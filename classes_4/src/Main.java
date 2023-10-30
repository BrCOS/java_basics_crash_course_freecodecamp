public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "S PLAID", "RED", 4);
        Plane plane = new Plane("Boeing", "777", "White", 1, 4);

        car.move();
        car.stop();

        plane.move();
        plane.stop();
    }
}

//both classes (Car and Plane) have two fields that are the same (name and color), so we created a generic class to avoid code repetition
//both classes also have the move and stop function, so we can put them in the generic class
class Vehicle {
    private String name;
    private String color;

    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //we did not declare this functions outside from this generic class, but we can call them bc they are in the parent class (generic class)
    //the super keyword means that we can call the class and everything that is inside of it
    public void move() {
        System.out.println("The vehicle  " + this.name + " is moving");
    }

    public void stop() {
        System.out.println("The vehicle " + this.name + " has stopped");
    }
}

//to inherit the values from the generic class we need to extend the generic class to the one that you want the values in
class Car extends Vehicle{
    private String model;
    private int doors;

    //creating a constructor
    public Car(String name, String model, String color, int doors) {
        super(name, color);//the keyword super means that we want the values from the class that you're inheriting to
        this.model = model;
        this.doors = doors;
    }
}

class Plane extends Vehicle{
    private String model;
    private int doors;
    private int engines;

    //creating a constructor
    public Plane(String name, String model, String color, int doors, int engines) {
        super(name, color);
        this.model = model;
        this.doors = doors;
        this.engines = engines;
    }

    //we can override a function that is in the parent class (Vehicle) (CTRL + O)
    @Override
    public void move() {
        System.out.println("Moving by flying");
        super.move();
    }
}
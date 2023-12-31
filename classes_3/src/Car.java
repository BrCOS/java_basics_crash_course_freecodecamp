public class Car {
    //by using private we can't access it from outside this class
    private String name;
    private String model;
    private String color;
    private int doors;

    //to create a constructor, use the name of the class then its parameters
    public Car(String name, String model, String color, int doors) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.doors = doors;
    }

    //creating an empty constructor
    //if no values from the Car constructor are provided (Name, Model, Color, Doors) we'll shall pass them below
    public Car() {
        this("Name", "Model", "Color", 0);//this is calling the constructor that does all the initialization
        //if from outside the class nobody passes any values to the constructor, these one are going to be passed to it
    }

    //to pass only the name (when creating an object) we will need another constructor
    public Car(String name) {
        this(name, "Model", "Color", 0);//we can change the values in quotation to whatever we want
    }

    //to pass the name and the model
    public Car(String name, String model) {
        this(name, model, "Color", 0);
    }

    //passing the name, model and color
    public Car(String name, String model, String color) {
        this(name, model, color, 0);
    }

    public void move() {
        System.out.println("The car " + this.name + " is moving");
    }

    public void stop() {
        System.out.println("The car " + this.name + " has stopped");
    }

    //but we can create getters and setters to access the values that we set (instanced) from outside (alt + ins)
    //when using private we are preventing our code to be accessed from outside
    //to do so, we have to use the getters to access just one value that it returns without compromising the others values
    //and to change them, we use the setters that will not change the value itself, but kind of make a copy of it and change the copy it has made

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
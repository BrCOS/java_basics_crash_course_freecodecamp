public class Car {
    //by using private we can't access it from outside this class
    private String name;
    private String model;
    private String color;
    private int doors;

    //creating a constructor -> use the name of the class
    public Car(String name, String model, String color, int doors) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.doors = doors;
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
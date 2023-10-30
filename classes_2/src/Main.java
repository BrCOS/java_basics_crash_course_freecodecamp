public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "S PLAID", "Silver", 4);
        Car car2 = new Car("Ford", "Mustang", "Red", 2);

        //the name, model, color and doors are private, so it can't be accessed from outside the class
        System.out.println(car.getName());//only able to print because we created the getters and setters on the Car class
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getDoors());

        System.out.println("\n");

        System.out.println(car2.getName());
        System.out.println(car2.getModel());
        System.out.println(car2.getColor());
        System.out.println(car2.getDoors());

        //we can use setters to make a safe copy of the value and change it (won't change the value itself)
        car.setName("Corvette");
        System.out.println(car.getName());
    }
}
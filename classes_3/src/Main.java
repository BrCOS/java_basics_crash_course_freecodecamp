public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "S PLAID", "Silver", 4);
        Car car2 = new Car();//we are not passing any values to the constructor, and we are using the default values that we created
        Car car3 = new Car("GM", "Corvette", "Red");//here we can pass only the values that we want

        System.out.println(car2.getName());
        System.out.println(car2.getModel());
        System.out.println(car2.getColor());
        System.out.println(car2.getDoors());

        System.out.println("\n");

        System.out.println(car3.getName());
        System.out.println(car3.getModel());
        System.out.println(car3.getColor());
        System.out.println(car3.getDoors());
    }
}
public class Main {
    public static void main(String[] args) {
        int age = 12;

        if (age >= 18) {
            System.out.println("You can vote");
            System.out.println("Please put an 'X' in the ballot");
        } else {
            System.out.println("You can't vote \nPlease come in " + (18 - age) + " years");
        }
    }
}
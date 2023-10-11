public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = -4;

        //this is the logical OR, so it will return true if at least of the expressions are true
        if (num1 > 0 || num2 > 0) {
            System.out.println("The condition is true");
        } else {
            System.out.println("All conditions failed");
        }
    }
}
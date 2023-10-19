public class Main {
    public static void main(String[] args) {
        int max = getMax(1, 5);
        System.out.println("The bigger number is: " + max);
    }

    //if we don't want to return anything just type "void"
    public static void sayHello(String name, int age) {
        System.out.println("Hello " + name + "!" + " Your age is " + age);
    }

    //in the case below we want to return a value, so we type the type of the value that we want (String, int, etc.)
    public static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
            //after the keyword "return" the function stops, so nothing after that will not execute!
        }
    }
}
public class Main {
    public static void main(String[] args) {
        //double is more precise than float
        //float is 32-bit and double is 64-bit
        float number = 3.14F; //the "F" is necessary bc the assumed data-type is double
        double number1 = 2.0;

        float maxFloatValue = Float.MAX_VALUE;
        float minFloatValue = Float.MIN_VALUE;

        System.out.println("The maximum float number is: " + maxFloatValue);
        System.out.println("The minimum float number is: " + minFloatValue);

        double maxDoubleValue = Double.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;

        System.out.println("The maximum double number is: " + maxDoubleValue);
        System.out.println("The minimum double number is: " + minDoubleValue);

    }
}
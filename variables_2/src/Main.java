public class Main {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("The maximum value for an int is: " + max);
        System.out.println("The minimum value for an int is: " + min);

        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;

        System.out.println("The maximum value for an byte is: " + maxByteValue);
        System.out.println("The minimum value for an byte is: " + minByteValue);

        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        System.out.println("The maximum value for an long is: " + maxLongValue);
        System.out.println("The minimum value for an long is: " + minLongValue);

        long myNumber = 21474836478L; //the "L" is necessary bc the number typed is treated like an int (literal bc we typed it ourselves)
    }
}
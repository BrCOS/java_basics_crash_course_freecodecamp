public class Main {
    public static void main(String[] args) {
        int number = 0;
        //we use while when we are not sure how many times we'll want it to execute, but we know we want it to execute while a condition is true
        while(number <= 10) {
            System.out.println(number);
            number++;
            //we are doing a prefix incrementation, that's why the print is above the number++, so we don't get the number 11
            //while loops, will do something while a condition is true, be careful to not create infinite loops
        }
    }
}
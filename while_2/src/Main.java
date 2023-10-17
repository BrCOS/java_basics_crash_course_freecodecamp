public class Main {
    public static void main(String[] args) {
        int number = 0;

        //this loop will execute at least once, even if the condition is false, the rest is pretty much like the while loop
        do {
            System.out.println(number);
            //number++;
            //we can add the line above to do the incrementation
        } while (number >= 1);//to do the incrementation just change the expression to (number <=10)
    }
}
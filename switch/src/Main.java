public class Main {

    public static void main(String[] args) {

        System.out.println("What time it is?");
        int time = 2;

        //we are testing the value against the ones we have on each case
        switch (time) {
            case 10:
                System.out.println("The time is " + time + "\nTime for a coffee.");
                break; //without the <break> the code will execute all the cases
            case 12:
                System.out.println("The time is " + time + "\nTime for a run.");
                break;
            case 7:
                System.out.println("The time is " + time + "\nTime to wake up.");
                break;
            default: //if all the conditions failed the <<default>> is executed
                System.out.println("Time to relax.");
                break;
        }
    }
}
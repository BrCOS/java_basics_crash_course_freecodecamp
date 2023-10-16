public class Main {

    public static void main(String[] args) {

        System.out.println("What time it is?");
        int time = 2;

        //this is the enhanced switch, we do not need the <break> here
        switch (time) {
            case 10 -> System.out.println("The time is " + time + "\nTime for a coffee."); //we need to put curly braces <{}> when we have multiple lines of code
            /* case example with curly braces with switch enhanced
             case 10 -> {
               case 10 -> System.out.println("The time is " + time + "\nTime for a coffee.");
             }
             */
            case 12 -> System.out.println("The time is " + time + "\nTime for a run.");
            case 7 -> System.out.println("The time is " + time + "\nTime to wake up.");
            default -> System.out.println("Time to relax.");//if all the conditions failed the <<default>> is executed System.out.println("Time to relax.");
        }
    }
}
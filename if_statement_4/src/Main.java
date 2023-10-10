public class Main {
    public static void main(String[] args) {
       int age = 17;

       if (age >= 18) {
           System.out.println("You can vote");
           System.out.println("Please put an X in the ballot");
       } else {
           if (18 - age == 1) {
               System.out.println("You can't vote \nPlease come in " + (18 - age) + " year");
           } else {
               System.out.println("You can't vote \nPlease come in " + (18 - age) + " years");
           }
       }
    }
}
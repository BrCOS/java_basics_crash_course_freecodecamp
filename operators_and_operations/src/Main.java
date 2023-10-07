public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        //when diving the values, it won't show the fractional part bc we're using integers
        //so to fix it, we just need to change the variables to float
        //on the tutorial, they just change the num1 and num2 to float instead of the original type int
        //now we changed it to double, bc the precision is, well, more precise
        //and, now we're back with the int type

        System.out.println(num1 % num2);
        //get the rest of the operation (the rest of 5 / 3) -> it's called 'modulus'

        System.out.println((num1 + num2) * 4);

        int myNumber = 0;
        //abbreviation -> myNumber = myNumber +1; (is the same that ->) myNumber += 1;

        myNumber += 4;
        System.out.println(myNumber);

        myNumber -= 4;
        System.out.println(myNumber);

        myNumber *= 4;
        System.out.println(myNumber);

        myNumber /= 4;
        System.out.println(myNumber);

        myNumber %= 4;
        System.out.println(myNumber);

        //postfix incrementation
        myNumber = 0;
        System.out.println(myNumber++);
        //it doesn't work bc the code first print the value (0) and then increments it
        //basically it will work if we put another println afterwords
        System.out.println(myNumber);

        //prefix incrementation
        myNumber = 0;
        System.out.println(++myNumber);
        //so this first increase the number and then it prints it

        //prefix decrementation
        myNumber = 0;
        System.out.println(--myNumber);
        //so this one takes one number out and then prints the number

        //postfix decrementation
        myNumber = 0;
        System.out.println(myNumber--);
        //the same logic applies here as the postfix incrementation
        System.out.println(myNumber);

    }
}
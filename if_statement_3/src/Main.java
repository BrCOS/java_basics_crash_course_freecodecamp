public class Main {
    public static void main(String[] args) {
        boolean isActive = true;
        int myNumber = 20;

        if (!(myNumber >= 10)) {
            System.out.println("The user is active");
        } else {
            System.out.println("The user is not active");
        }
        //we don't need to type isActive == true, bc it's implicit (the variable already is true)
        //we can put the logical operator in front of the expression
        //so when we type "!isActive" -> it will be false, bc of the logical NOT operator "!"
        //now we've changed the "isActive" to "!(myNumber >= 10)
        //even though myNumber >= is true, we have the logical operator NOT, so now the expression is false
    }
}
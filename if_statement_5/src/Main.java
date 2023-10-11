public class Main {
    public static void main(String[] args) {
        boolean isActive = false;
        int score = 100;

        //the operator AND "&&" is checking if both expressions are true
        if (score >= 100 && isActive) {//we can remove the isActive == true, bc is redundant
            System.out.println("You opened the next level");
        } else {
            System.out.println("You are at the same level");
        }

        //both conditions have to be true in order for the expression returns true
    }
}
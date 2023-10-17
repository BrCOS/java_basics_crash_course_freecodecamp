public class Main {
    public static void main(String[] args) {
        //we can add an if statement into the for loop
        //in this case we are using the continue statement, when "i" is >= 30 and <= 50 the code will skip that part
        for (int i = 0; i <= 100; i++) {
            if (i >= 30 && i <= 50) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
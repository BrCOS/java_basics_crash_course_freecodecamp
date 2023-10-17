public class Main {
    public static void main(String[] args) {
        //we can add an if statement into the for loop
        //in this case when "i" reaches 50, it will stop
        //bc it's a postfix incrementation it will not display the value that it reached, we learned that some commits ago
        for (int i = 0; i <= 100; i++) {
            if (i == 50) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
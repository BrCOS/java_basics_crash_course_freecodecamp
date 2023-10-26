public class Main {
    public static void main(String[] args) {
        //create a function that receives an array (of numbers) as a parameter than returns the biggest number in it
        int[] numbers = {1, 2, 3, 4, 7, 8, 9, 22, 33, 99, 1001};
        int maxFound = getMax(numbers);
        System.out.println(maxFound);
    }

    public static int getMax(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }
}
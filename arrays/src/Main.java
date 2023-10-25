public class Main {
    public static void main(String[] args) {
        //an array allows us to store multiple values in a single variable
        //the values are stored as indexes, starting at 0
        int[] numbers = {12, 15, 60, 100, 200, 20, 50};

        for (int number: numbers) {
            System.out.println(number);
        }
        //printing the values using index
        System.out.println(numbers[1]);

        //printing each number in the array with a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\n");

        //printing each name in the array with a for loop
        String[] friends = {"Maria", "Alex", "Anna", "Steve", "Michel"};
        for (String friend : friends) {
            System.out.println(friend);
        }

        System.out.println("\n");

        //another way of printing the names in the array
        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i]);
        }

        System.out.println("\n");

        //creating an array
        int[] numbers2 = new int[5]; //declaring an array then saying that it will have 5 elements in total
        numbers2[0] = 1;
        numbers2[1] = 37;
        numbers2[2] = 39;
        numbers2[3] = 41;
        numbers2[4] = 56;
        //numbers2[5] = 90;//if we try to add a sixth element, we will get an error message
    }
}
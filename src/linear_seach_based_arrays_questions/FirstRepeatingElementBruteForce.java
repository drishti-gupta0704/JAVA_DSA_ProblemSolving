package linear_seach_based_arrays_questions;

public class FirstRepeatingElementBruteForce {
    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("First repeating element: " + arr[i]);
                    return;
                }
            }
        }

        System.out.println("No repeating element found");
    }
}

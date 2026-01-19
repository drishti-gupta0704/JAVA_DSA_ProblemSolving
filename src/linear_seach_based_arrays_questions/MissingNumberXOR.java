package linear_seach_based_arrays_questions;

public class MissingNumberXOR {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // Missing number is 3

        int n = arr.length + 1;  // Total numbers from 1 to N

        int xorAll = 0;   // XOR of all numbers from 1 to N
        int xorArr = 0;   // XOR of all elements in array

        // XOR all numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        // XOR all elements in the array
        for (int num : arr) {
            xorArr ^= num;
        }

        // Missing number = XOR of the above two results
        int missingNumber = xorAll ^ xorArr;

        System.out.println("Missing number: " + missingNumber);
    }
}

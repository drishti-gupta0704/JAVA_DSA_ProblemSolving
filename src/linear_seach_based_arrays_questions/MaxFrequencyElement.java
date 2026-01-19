package linear_seach_based_arrays_questions;
import java.util.Arrays ;
public class MaxFrequencyElement {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 2, 1, 3, 2, 2, 2}; // Example array
        int maxFreqElement = findMaxFrequencyElement(arr);
        System.out.println("Element with maximum frequency: " + maxFreqElement);
    }

    public static int findMaxFrequencyElement(int[] arr) {
        Arrays.sort(arr); // Step 1: Sort the array

        int maxCount = 1;
        int currentCount = 1;
        int maxElement = arr[0];

        // Step 2: Traverse and count frequencies
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1; // reset count for new element
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxElement = arr[i];
            }
        }

        return maxElement;
    }
}

package linear_seach_based_arrays_questions;

public class MaxFrequencyElementBruteForce {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 2, 1, 3, 2, 2, 2}; 
        int maxFreqElement = findMaxFrequencyElement(arr);
        System.out.println("Element with maximum frequency: " + maxFreqElement);
    }

    public static int findMaxFrequencyElement(int[] arr) {
        int maxCount = 0;
        int maxElement = arr[0];

        // Step 1: Check frequency of each element
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Step 2: Update max frequency and element
            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        return maxElement;
    }
}

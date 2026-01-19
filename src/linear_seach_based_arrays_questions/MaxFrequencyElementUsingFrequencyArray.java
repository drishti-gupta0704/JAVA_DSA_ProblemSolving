package linear_seach_based_arrays_questions;

public class MaxFrequencyElementUsingFrequencyArray {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1, 4, 1, 3};

        // Step 1: Find maximum element to size frequency array
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Step 2: Create frequency array
        int[] freq = new int[max + 1];

        // Step 3: Store frequencies
        for (int num : arr) {
            freq[num]++;
        }

        // Step 4: Find element with maximum frequency
        int maxFreq = 0;
        int element = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                element = i;
            }
        }

        System.out.println("Element with maximum frequency: " + element);
        System.out.println("Frequency: " + maxFreq);
    }
}

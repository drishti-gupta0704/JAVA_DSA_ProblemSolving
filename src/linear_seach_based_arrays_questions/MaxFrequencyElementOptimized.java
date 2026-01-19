package linear_seach_based_arrays_questions;

public class MaxFrequencyElementOptimized {
    public static void main(String[] args) {
        // works for Negative numbers
        int[] arr = {3, -1, 4, -1, -1, 2, 3};

        // Step 1: Find min and max
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Step 2: Create optimized frequency array
        int[] freq = new int[max - min + 1];

        // Step 3: Count frequency
        for (int num : arr) {
            freq[num - min]++;
        }

        // Step 4: Find max frequency element
        int maxFreq = 0;
        int element = arr[0];

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                element = i + min;
            }
        }

        System.out.println("Element with maximum frequency: " + element);
        System.out.println("Frequency: " + maxFreq);
    }
}

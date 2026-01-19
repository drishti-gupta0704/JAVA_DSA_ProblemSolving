package linear_seach_based_arrays_questions;

public class CountOccurrencesOfEachElementUsingFrequencyArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1, 3};

        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }

        int[] freq = new int[max + 1];

        // Count occurrences
        for (int num : arr) {
            freq[num]++;
        }

        // Print result
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }
}

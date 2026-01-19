package linear_seach_based_arrays_questions;

public class FirstRepeatingElementFrequencyArray {
    //Works only when values are small & non-negative
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 3, 5, 6};

        int[] freq = new int[100]; // range assumption

        for (int num : arr) {
            freq[num]++;
        }

        for (int num : arr) {
            if (freq[num] > 1) {
                System.out.println("First repeating element: " + num);
                return;
            }
        }
    }
}

package linear_seach_based_arrays_questions;

public class ElementThatAppearsOnceBruteForce {
// using for small range and non negative
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        int[] freq = new int[100]; // assuming small range

        for (int num : arr) {
            freq[num]++;
        }

        for (int num : arr) {
            if (freq[num] == 1) {
                System.out.println("Element appearing once: " + num);
                return;
            }
        }
    }
}

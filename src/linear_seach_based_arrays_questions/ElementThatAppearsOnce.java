package linear_seach_based_arrays_questions;

public class ElementThatAppearsOnce {

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        int xor = 0;

        for (int num : arr) {
            xor = xor ^ num;
        }

        System.out.println("Element appearing once: " + xor);
    }
}

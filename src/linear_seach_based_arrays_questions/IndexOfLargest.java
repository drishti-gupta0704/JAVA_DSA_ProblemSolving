package linear_seach_based_arrays_questions;

public class IndexOfLargest {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Index of largest element: " + maxIndex);
    }
}

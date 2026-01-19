package linear_seach_based_arrays_questions;

public class IndexOfSmallest {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};

        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Index of smallest element: " + minIndex);
    }
}

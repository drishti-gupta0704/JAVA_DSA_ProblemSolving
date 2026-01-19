package linear_seach_based_arrays_questions;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
            else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("Second smallest not found");
        } else {
            System.out.println("Second smallest element: " + secondMin);
        }
    }
}

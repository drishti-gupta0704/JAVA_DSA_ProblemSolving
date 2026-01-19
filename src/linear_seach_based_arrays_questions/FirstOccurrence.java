package linear_seach_based_arrays_questions;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 2};
        int target = 2;

        int index = firstOccurrence(arr, target);
        System.out.println(index);
    }

    public static int firstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;   // first (smallest) index
            }
        }
        return -1;          // element not found
    }
}


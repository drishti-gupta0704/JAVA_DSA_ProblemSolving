package linear_seach_based_arrays_questions;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 2};
        int target = 2;

        int index = lastOccurrence(arr, target);
        System.out.println(index);
    }

    public static int lastOccurrence(int[] arr, int target) {
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lastIndex = i;   // keep updating
            }
        }
        return lastIndex;
    }
}

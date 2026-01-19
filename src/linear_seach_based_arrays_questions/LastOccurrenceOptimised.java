package linear_seach_based_arrays_questions;
public class LastOccurrenceOptimised {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 2};
        int target = 2;

        int index = lastOccurrence(arr, target);
        System.out.println(index);
    }

    public static int lastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

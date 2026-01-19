package linear_seach_based_arrays_questions;

public class ElementExists {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 9, 4};
        int target = 8;

        boolean exists = isPresent(arr, target);
        System.out.println(exists);
    }

    public static boolean isPresent(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;   // element found
            }
        }
        return false;          // element not found
    }
}
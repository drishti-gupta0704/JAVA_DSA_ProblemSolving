package two_pointer_technique;
import java.util.Arrays;

public class PairWithSumUnsorted {
    public static boolean hasPair(int[] arr, int target) {
        //  Sort the array
        Arrays.sort(arr);

        //  Two pointer approach
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 2, 6};
        System.out.println(hasPair(arr, 6));
    }

}

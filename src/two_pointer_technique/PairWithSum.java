package two_pointer_technique;
// use when its mentioned that array is sorted + pair sum
public class PairWithSum {
    public static boolean hasPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;   // increase sum
            } else {
                right--;  // decrease sum
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println(hasPair(arr, 6));
    }
}

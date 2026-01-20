package two_pointer_technique;
//Problem Statement
//Given a sorted array and a target, find two elements whose sum is closest to the target.
public class ClosestPair {
    public static void closestPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        int minDiff = Integer.MAX_VALUE;
        int resLeft = 0, resRight = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            int diff = Math.abs(sum - target);

            // update closest pair
            if (diff < minDiff) {
                minDiff = diff;
                resLeft = left;
                resRight = right;
            }

            // move pointers
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Closest Pair: "
                + arr[resLeft] + ", " + arr[resRight]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 10};
        int target = 15;

        closestPair(arr, target);
    }

}

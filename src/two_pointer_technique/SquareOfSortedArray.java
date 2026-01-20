package two_pointer_technique;

public class SquareOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[pos] = leftSq;
                left++;
            } else {
                result[pos] = rightSq;
                right--;
            }
            pos--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] ans = sortedSquares(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}

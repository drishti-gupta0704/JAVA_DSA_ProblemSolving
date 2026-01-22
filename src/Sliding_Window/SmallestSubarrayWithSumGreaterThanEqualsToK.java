package Sliding_Window;

public class SmallestSubarrayWithSumGreaterThanEqualsToK {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 2, 4, 3};
        int K = 7;

        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum >= K) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }

        System.out.println(minLen == Integer.MAX_VALUE ? 0 : minLen);
    }
}

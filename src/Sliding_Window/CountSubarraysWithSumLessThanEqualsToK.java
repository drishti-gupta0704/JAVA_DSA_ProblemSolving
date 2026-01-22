package Sliding_Window;

public class CountSubarraysWithSumLessThanEqualsToK {

        public static void main(String[] args) {

            int[] arr = {1, 2, 3};
            int K = 4;

            int left = 0, sum = 0;
            int count = 0;

            for (int right = 0; right < arr.length; right++) {

                sum += arr[right];

                while (sum > K) {
                    sum -= arr[left];
                    left++;
                }

                count += (right - left + 1);
            }

            System.out.println(count);
        }
    }



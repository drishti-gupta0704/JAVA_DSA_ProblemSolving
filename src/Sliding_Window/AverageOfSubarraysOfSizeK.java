package Sliding_Window;

import java.util.Arrays;

//Finding the average of every contiguous subarray of size k
public class AverageOfSubarraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        double[] result = new double[arr.length - k + 1];
        int windowsum = 0;
        for (int i = 0; i < arr.length; i++) {
            windowsum += arr[i];
            if (i >= k - 1) {
                result[i - k + 1] = (double) windowsum / k;
                windowsum -= arr[i - k + 1];

            }
        }
        System.out.println(Arrays.toString(result));
    }
}



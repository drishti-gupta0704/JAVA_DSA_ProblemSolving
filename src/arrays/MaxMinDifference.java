package arrays;

public class MaxMinDifference {
    public static int findDifference(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2};
        System.out.println(findDifference(arr));
    }
}

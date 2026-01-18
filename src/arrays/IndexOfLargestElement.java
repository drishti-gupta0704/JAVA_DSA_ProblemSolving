package arrays;

public class IndexOfLargestElement {
    public static int findIndexOfLargest(int[] arr) {
        int max = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2};
        System.out.println(findIndexOfLargest(arr));
    }
}

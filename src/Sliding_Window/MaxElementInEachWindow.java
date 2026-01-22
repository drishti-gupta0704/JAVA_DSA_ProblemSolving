package Sliding_Window;
import java.util.ArrayList;
//Naive sliding window version
//Optimized Deque Approach (LeetCode 239)
public class MaxElementInEachWindow {
    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {

            int max = arr[i];

            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            result.add(max);
        }

        System.out.println(result);
    }
}

package sorting_based_questions;
import java.util.*;
public class SortNearlySortedArray {
    public static void main(String[] args) {

        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        sortKSortedArray(arr, k);

        System.out.println(Arrays.toString(arr));
    }

    public static void sortKSortedArray(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int index = 0;


        for (int i = 0; i <= k && i < arr.length; i++) {
            minHeap.add(arr[i]);
        }


        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = minHeap.poll();
            minHeap.add(arr[i]);
        }


        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }
    }
}

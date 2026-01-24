package sorting_based_questions;
import java.util.*;
public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int[] nums ={1,1,1,1,2,2,2,3,5,3,4,5,2};
        int k=2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //  Min Heap (by frequency)
        PriorityQueue<Integer> heap = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b)
        );

        // Keep top k elements
        for (int key : map.keySet()) {
            heap.add(key);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        //  Extract result
        int[] result = new int[k];
        int i = 0;
        while (!heap.isEmpty()) {
            result[i++] = heap.poll();
        }

        System.out.println(Arrays.toString(result));
    }
}

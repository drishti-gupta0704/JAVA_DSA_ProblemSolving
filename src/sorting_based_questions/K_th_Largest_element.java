package sorting_based_questions;
import java.util.*;

public class K_th_Largest_element {
    public static void main(String[] args) {
        int[]nums={1,2,2,3,4,5,6};
        int k=2;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest
            }
        }

        System.out.println(minHeap.peek()); ; // root = kth largest
    }

}

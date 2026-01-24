package sorting_based_questions;
import java.util.*;
public class K_th_smallest_element {
    public static void main(String[] args) {
        int[]nums ={1,2,2,3,4,5,6,1};
        int k=2;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove largest
            }
        }

        System.out.println(maxHeap.peek());  // root = kth smallest
    }
}

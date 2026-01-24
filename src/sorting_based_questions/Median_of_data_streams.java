package sorting_based_questions;
import java.util.*;
public class Median_of_data_streams {

    public static void main(String[] args) {


        PriorityQueue<Integer> maxHeap; // left side
        PriorityQueue<Integer> minHeap; // right side


        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();



        // Step 1: add to maxHeap
        maxHeap.offer(num);

        // Step 2: fix order
        if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
            minHeap.offer(maxHeap.poll());
        }

        // Step 3: balance size
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        }
        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }



        if (maxHeap.size() > minHeap.size()) {
            System.out.println(maxHeap.peek());
        }
        System.out.println((maxHeap.peek() + minHeap.peek()) / 2.0);
    }


    }



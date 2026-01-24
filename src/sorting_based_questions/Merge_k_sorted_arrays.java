package sorting_based_questions;
import java.util.*;
public class Merge_k_sorted_arrays {
    public static void main(String[] args) {


        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] - b[0]
        );
        // {value, arrayIndex, elementIndex}
        for (int i = 0; i < arr.length; i++) {
            pq.add(new int[]{arr[i][0], i, 0});
        }

        List<Integer> res = new ArrayList<>();

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            res.add(curr[0]);

            int r = curr[1];
            int c = curr[2];

            if (c + 1 < arr[r].length) {
                pq.add(new int[]{arr[r][c + 1], r, c + 1});
            }
        }

    }
}

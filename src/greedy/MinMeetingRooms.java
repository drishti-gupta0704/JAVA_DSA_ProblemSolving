package greedy;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MinMeetingRooms {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= minHeap.peek()) {
                minHeap.poll();
            }
            minHeap.add(intervals[i][1]);
        }
        return minHeap.size();
    }

    public static void main(String[] args) {
        MinMeetingRooms sol = new MinMeetingRooms();

        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        int[][] intervals2 = {{7, 10}, {2, 4}};

        System.out.println(sol.minMeetingRooms(intervals1));
        System.out.println(sol.minMeetingRooms(intervals2));
    }
}

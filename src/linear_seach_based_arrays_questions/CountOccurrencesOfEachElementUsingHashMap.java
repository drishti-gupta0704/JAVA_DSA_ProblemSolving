package linear_seach_based_arrays_questions;
import java.util.HashMap;

public class CountOccurrencesOfEachElementUsingHashMap {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // getOrDefault() avoids if-else
        // Print result
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

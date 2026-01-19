package linear_seach_based_arrays_questions;
import java.util.HashMap;

public class MaxFrequencyElementHashMap {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1, 4, 1, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        int maxFreq = 0;
        int element = arr[0];

        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                element = key;
            }
        }

        System.out.println(element);
    }
}

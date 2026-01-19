package linear_seach_based_arrays_questions;
import java.util.HashMap;

public class FirstNonRepeatingElementUsingHashMap {
    public static void main(String[] args) {

        int[] arr = {9, 4, 9, 6, 7, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find first non-repeating element
        for (int num : arr) {
            if (map.get(num) == 1) {
                System.out.println("First non-repeating element: " + num);
                return;
            }
        }

        System.out.println("No non-repeating element found");
    }
}

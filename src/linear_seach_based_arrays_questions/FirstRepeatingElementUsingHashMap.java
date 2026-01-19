package linear_seach_based_arrays_questions;
import java.util.HashMap;

public class FirstRepeatingElementUsingHashMap {
    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Traverse array again to find first repeating
        for (int num : arr) {
            if (map.get(num) > 1) {
                System.out.println("First repeating element: " + num);
                return;
            }
        }

        System.out.println("No repeating element found");
    }
}

package linear_seach_based_arrays_questions;
import java.util.HashMap;
public class ElementThatAppearsOnceHashMap {

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println("Element appearing once: " + key);
            }
        }
    }
}

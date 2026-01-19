package linear_seach_based_arrays_questions;
import java.util.HashSet;

public class FirstRepeatingElementUsingHashSet {

    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("First repeating element: " + num);
                return;
            }
            set.add(num);
        }

        System.out.println("No repeating element found");
    }
}

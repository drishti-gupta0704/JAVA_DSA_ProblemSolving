package linear_seach_based_arrays_questions;
import java.util.HashSet;

public class FirstNonRepeatingElementUsingHashSet {

    public static void main(String[] args) {

        int[] arr = {9, 4, 9, 6, 7, 4};

        HashSet<Integer> repeating = new HashSet<>();
        HashSet<Integer> nonRepeating = new HashSet<>();

        for (int num : arr) {
            if (nonRepeating.contains(num)) {
                nonRepeating.remove(num);
                repeating.add(num);
            } else if (!repeating.contains(num)) {
                nonRepeating.add(num);
            }
        }

        for (int num : arr) {
            if (nonRepeating.contains(num)) {
                System.out.println("First non-repeating element: " + num);
                return;
            }
        }
    }
}

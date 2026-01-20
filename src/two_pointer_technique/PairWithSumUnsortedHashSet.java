package two_pointer_technique;
import java.util.HashSet;

public class PairWithSumUnsortedHashSet {
    public static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 2, 6};
        System.out.println(hasPair(arr, 6));
    }
}

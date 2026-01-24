package sorting_based_questions;
import java.util.Arrays;
public class Sort_an_array {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3};

        Arrays.sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

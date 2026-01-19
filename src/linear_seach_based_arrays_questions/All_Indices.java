package linear_seach_based_arrays_questions;
import java.util.ArrayList;
public class All_Indices {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 2};
        int target = 2;

        ArrayList<Integer> indices = findAllIndices(arr, target);
        System.out.println(indices);
    }

    public static ArrayList<Integer> findAllIndices(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result.add(i);   // store index
            }
        }
        return result;
    }
}

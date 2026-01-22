package Sliding_Window;
import java.util.HashMap;
public class LongestSubarrayWithAtmostKdistinctElements {

    public class LongestSubarrayAtMostKDistinct {
        public static void main(String[] args) {

            int[] arr = {1, 2, 1, 2, 3};
            int K = 2;

            HashMap<Integer, Integer> map = new HashMap<>();
            int left = 0;
            int maxLen = 0;

            for (int right = 0; right < arr.length; right++) {

                // add right element
                map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

                // shrink if more than K distinct
                while (map.size() > K) {
                    map.put(arr[left], map.get(arr[left]) - 1);

                    if (map.get(arr[left]) == 0) {
                        map.remove(arr[left]);
                    }
                    left++;
                }

                // update max length
                maxLen = Math.max(maxLen, right - left + 1);
            }

            System.out.println(maxLen);
        }
    }

}

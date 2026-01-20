package two_pointer_technique;
//All evens on left
// All odds on right
public class SegregateEvenOdd {
    public static void segregate(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // move left until odd found
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // move right until even found
            while (left < right && arr[right] % 2 == 1) {
                right--;
            }

            // swap misplaced elements
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        segregate(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

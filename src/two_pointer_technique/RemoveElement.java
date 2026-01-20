package two_pointer_technique;
//remove all the occurrences of an element x and return new length
public class RemoveElement {

    public static int removeElement(int[] nums, int x) {
        int j = 0; // index for valid elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != x) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int len = removeElement(nums, 3);

        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

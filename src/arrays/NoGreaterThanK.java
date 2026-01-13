package arrays;

public class NoGreaterThanK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 24, 4, 56, 67, 7, 6, 6, 7, 9};
        int k = 9, counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > k)
                counter++;
        }
        System.out.println("no greater than  " + k + "  are  " + counter);
    }
}
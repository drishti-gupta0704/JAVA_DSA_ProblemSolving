package arrays;

public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,68};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.printf("%.2f",average);

    }
}
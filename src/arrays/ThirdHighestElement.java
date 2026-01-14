package arrays;

public class ThirdHighestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15, 3};

        if (arr.length < 3) {
            System.out.println("Third highest element not found");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third && arr[i] != first && arr[i] != second) {
                third = arr[i];
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("Third highest element not found");
        } else {
            System.out.println("Third highest element: " + third);
        }
    }
}


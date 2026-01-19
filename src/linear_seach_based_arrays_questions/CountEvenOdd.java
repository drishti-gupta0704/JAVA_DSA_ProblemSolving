package linear_seach_based_arrays_questions;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 10, 5};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}

//if ((arr[i] & 1) == 0) evenCount++;
//else oddCount++;
//use bitwise AND
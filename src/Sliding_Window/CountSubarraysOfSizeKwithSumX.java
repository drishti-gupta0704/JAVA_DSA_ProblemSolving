package Sliding_Window;
//Count how many contiguous subarrays of
// size exactly K have sum = X
public class CountSubarraysOfSizeKwithSumX {
    public static void main(String[] args) {
        int[] arr = {2,1,3,2,4,1};
        int k=3;
        int x=6,count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){

            sum+= arr[i];
            if(i>=k-1) {
                if (sum == x)
                    count++;
                sum-= arr[i-k+1];
            }

            }
        System.out.println(count);
        }
    }


package Sliding_Window;
//max sum subarray of size k
public class MinimumSumSubarray {
    public static void main(String[] args) {
        int windowsum=0;
        int minsum= Integer.MAX_VALUE;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k=3;
        for(int i=0;i<arr.length;i++){
            windowsum += arr[i];

            if(i>=k-1){
                minsum = Math.min(windowsum,minsum);
                windowsum -= arr[i-k+1];
            }
        }
        System.out.println(minsum);
    }
}

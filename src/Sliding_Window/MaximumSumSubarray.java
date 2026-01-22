package Sliding_Window;
//max sum subarray of size k
public class MaximumSumSubarray {
    public static void main(String[] args) {
        int windowsum=0;
        int maxsum= Integer.MIN_VALUE;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k=3;
        for(int i=0;i< arr.length;i++){
            windowsum+=arr[i];

            if(i>= k-1){
                maxsum= Math.max(maxsum,windowsum);
                windowsum -= arr[i-k+1];
            }
        }
        System.out.println(maxsum);
    }
}

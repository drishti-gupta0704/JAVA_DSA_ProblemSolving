package Sliding_Window;

public class LongestSubarrayWithSumLessThanOrEqualsToK {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k=7;
        int left=0,sum=0,maxlen=0;
        for(int right=0;right<arr.length;right++){
            sum+= arr[right];

            while(sum>k){
                sum -= arr[left];
                left++;
            }
            maxlen= Math.max(maxlen,right-left+1);
        }

        System.out.println(maxlen);
    }

}

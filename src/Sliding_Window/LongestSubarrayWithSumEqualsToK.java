package Sliding_Window;

public class LongestSubarrayWithSumEqualsToK {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,1,1,1};
        int k=3;
        int left=0,sum=0,maxlen=0;
        for(int right=0;right<arr.length;right++){
            sum+= arr[right];

            while(sum>k){
                sum-= arr[left];
                left++;
            }

            if(sum==k){
                maxlen=Math.max(maxlen,right-left+1);
            }
        }

        System.out.println(maxlen);
    }
}

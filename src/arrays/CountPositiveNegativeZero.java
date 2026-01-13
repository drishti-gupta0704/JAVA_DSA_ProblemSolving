package arrays;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        int [] arr = {1,2,-3,4,0,5,-6,7,};
        int pos=0,neg=0,zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
                pos++;
            else if (arr[i]<0) {
                neg++;
            }
            else
                zero++;
        }
        System.out.println("no of positive elements are  "+pos);
        System.out.println("no of negative elements are  "+neg);
        System.out.println("no of zero elements are  "+zero);
    }
}

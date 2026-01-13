package arrays;

public class MinelementArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int min= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[0]<min){
                min= arr[0];
            }
        }
        System.out.println("smallest element is :"+ min);
    }
}

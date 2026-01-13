package arrays;

public class CountEvenOdd {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        int no_of_odd = 0;
        int no_of_even = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                no_of_even ++ ;
            }
            else {
                no_of_odd ++ ;
            }
        }
        System.out.println("no of odd elements are  "+ no_of_odd);
        System.out.println("no of even elements are  "+ no_of_even);
    }
}

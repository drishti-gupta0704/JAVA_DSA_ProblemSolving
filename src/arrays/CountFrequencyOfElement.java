package arrays;

public class CountFrequencyOfElement {
    public static void main(String[] args) {
        int[] arr ={12,34,4,5,6,7,88,5,};
        int x=5,frequency=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                frequency++;
        }
        System.out.println("total no of occurences of "+x + " is "+ frequency);
    }
}

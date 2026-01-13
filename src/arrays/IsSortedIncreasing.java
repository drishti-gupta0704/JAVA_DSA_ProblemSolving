package arrays;

public class IsSortedIncreasing {
    public static void main(String[] args) {
        int[] arr= {1,2,3,5,7,8,9};
        boolean issorted =true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
            { issorted=false;
                break;  }

        }

        if(issorted){
            System.out.println("array is sorted increasingly");
        }
        else
            System.out.println("array is not sorted increasingly");
    }
}

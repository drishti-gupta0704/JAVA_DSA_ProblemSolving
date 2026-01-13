package arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,2};
        boolean duplicate = false;
        for(int i=1;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]==arr[j])
                {
                    duplicate=true;
                    break;
                }
            if(duplicate)
                break;
        }

        if(!duplicate){
            System.out.println("no duplicates");
        }
        else
            System.out.println("duplicate found");
    }
}

package arrays;
import java.util.HashSet;

public class DuplicateHashset {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,4};
        HashSet<Integer> set = new HashSet<>();
        boolean duplicate =false;
        for(int x : arr){
            if(set.contains(x)){
                duplicate=true;
                break;
            }

            set.add(x);
        }

        if(!duplicate)
            System.out.println("no duplicate");
        else
            System.out.println("duplicate found");
    }

}

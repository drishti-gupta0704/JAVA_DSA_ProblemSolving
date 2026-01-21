package bit_manipulation;
import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if((x & 1)==0){
            System.out.println("no is even");
        }

        else
            System.out.print("no is odd");

    }
  

}

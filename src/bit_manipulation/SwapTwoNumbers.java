package bit_manipulation;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        a = a^b;
        b= a^b;
        a= a^b;
        System.out.println("values are swapped. "+ "a= "+ a+ " b= "+ b);
    }
}

package bit_manipulation;
import java.util.Scanner;
public class PowerOfFour {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if( n>0 && (n & (n-1))==0 && (n&0x55555555) !=0)
            System.out.println("its a power of 4");

        else
            System.out.println("its not a power of 4 ");
    }
}

package bit_manipulation;
import java.util.Scanner;
public class Check_i_th_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i= sc.nextInt();
        if((n & (1<<i))!= 0)
            System.out.println("bit is set");
        else
            System.out.println("bit isnt set");
    }
}

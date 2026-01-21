package bit_manipulation;
import java.util.Scanner;
public class Set_i_th_bit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        n= n | (1<<i);
        System.out.println(n);
    }
}

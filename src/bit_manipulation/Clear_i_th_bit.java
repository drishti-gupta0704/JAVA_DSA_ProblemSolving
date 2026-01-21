package bit_manipulation;

public class Clear_i_th_bit {
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        n = (n & ~(1 << i));
        System.out.print(n);
    }

}
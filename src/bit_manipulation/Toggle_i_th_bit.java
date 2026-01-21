package bit_manipulation;

public class Toggle_i_th_bit {
    public static void main(String[] args) {
        int n=5;
        int x=1;
        n = (n ^ (1<<x));
        System.out.println(n);
    }

}

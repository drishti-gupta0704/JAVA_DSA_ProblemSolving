package bit_manipulation;

public class RightmostSetBit {
    public static void main(String[] args) {
        int n=12,a=0;
        a= n & (-n);
        System.out.println("rightmost bit is  " + a);
    }
}

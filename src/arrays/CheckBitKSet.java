package arrays;

public class CheckBitKSet {
    static boolean isKthBitSet(int n, int k) {
        //  return (n & (1 << k)) != 0;
        if (((n >> k -1) & 1) != 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 13;
        int k = 2;
        System.out.println(isKthBitSet(n, k));
    }
}

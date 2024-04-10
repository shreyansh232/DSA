package bitmanipulation;

public class ClearIthBit {
    static int clearKthBit(int n, int k) {
        // Use bitwise AND with the complement of the bit mask for the k-th bit
        return n & ~(1 << k);
    }

    public static void main(String[] args) {
        int n = 13;
        int k = 2;
        int result = clearKthBit(n, k);
        System.out.println(result);
    }
}

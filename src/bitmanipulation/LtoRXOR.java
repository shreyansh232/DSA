package bitmanipulation;

public class LtoRXOR {
    public static int findXOR(int L, int R){
        // int ans = 0;
        // int l = L;

        // for(L = l; L <= R; L++){
        //     ans = L ^ ans;

        // }
        // return ans;
        return xor(L - 1) ^ xor(R);



    }

    public static int xor(int n) {
        return switch (n % 4) {
            case 0 -> n;
            case 1 -> 1;
            case 2 -> n + 1;
            case 3 -> 0;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        System.out.println(findXOR(5, 10));
    }
}

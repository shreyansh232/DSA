package bitmanipulation;

public class LtoRXOR {
    public static int findXOR(int L, int R){
        // int ans = 0;
        // int l = L;

        // for(L = l; L <= R; L++){
        //     ans = L ^ ans;

        // }
        // return ans;
        int l = xor(L - 1);
        int r = xor(R);
        int ans = l ^ r;
        return ans;



    }

    public static int xor(int n) {
        switch (n % 4) {
            case 0:
                return n;
            case 1:
                return 1;
            case 2:
                return n + 1;
            case 3:
                return 0;
            default:
                return 0;


        }
    }

    public static void main(String[] args) {
        System.out.println(findXOR(5, 10));
    }
}

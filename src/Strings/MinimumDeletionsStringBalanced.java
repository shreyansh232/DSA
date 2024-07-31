package Strings;

public class MinimumDeletionsStringBalanced {
    public static int minimumDeletions(String s) {
        int res = 0, count = 0;
        for (char c : s.toCharArray()){
            if (c == 'b')
                count++;
            else if (count != 0){
                res++;
                count--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "aabbaab";
        System.out.println(minimumDeletions(s));
    }
}

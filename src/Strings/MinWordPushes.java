package Strings;
import java.util.Arrays;

public class MinWordPushes {
    public static int minimumPushes(String word) {
        //Store frequency
        int[] arr = new int[26];
        for(char c : word.toCharArray()){
            arr[c - 'a']++;
        }
        //Sort dec
        Arrays.sort(arr);
        int count = 0;
        int res = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 0) break;
            int val = (count/8 + 1) * arr[i];
            res += val;
            count++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(minimumPushes(s));
    }
}

package arrays;
import java.util.*;
public class LongestSubarraySumZero {
    public static int longestSumZero(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int max = 0;
        int sum = 0;

        for(int i = 0;i<n;i++) {

            sum += arr[i];

            if(sum == 0) {
                max = i + 1;
            }
            else {
                if(mpp.get(sum) != null) {

                    max = Math.max(max, i - mpp.get(sum));
                }
                else {

                    mpp.put(sum, i);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {1,-1,-4,5,7,6,-3};
        int b = longestSumZero(a);
        System.out.println(b);
    }
}

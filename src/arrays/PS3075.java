package arrays;

import java.util.Arrays;

public class PS3075 {
        public static long maximumHappinessSum(int[] happiness, int k) {
            Arrays.sort(happiness);
            int n = happiness.length;
            int dec = 0, updated = 0; // dec is used to decrement the values everytime the element is chosen
            long ans = 0;
            for (int i = n - 1; i >= n - k; i--) {
                updated = happiness[i] - dec;
                if (updated > 0) {
                    ans += updated;
                }
                dec++;
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] arr = {6,3,2,1,5};
        int k = 2;
        System.out.println(maximumHappinessSum(arr, k));

    }


}

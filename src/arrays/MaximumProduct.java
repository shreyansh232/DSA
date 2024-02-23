package arrays;

public class MaximumProduct {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        int pre = 1;
        int suf = 1;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suf == 0) suf = 1;
            pre = pre * nums[i];
            suf = suf * nums[n - i - 1];
            res = Math.max(res, Math.max(pre, suf));
        }
        return res;
    }

}

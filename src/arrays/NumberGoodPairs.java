package arrays;

import java.util.Arrays;

public class NumberGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int[] frequency = new int[101]; // Since the given constraint is 1 <= nums[i] <= 100

        int goodPairs = 0;

        // Count the occurrences of each number
        for (int i : nums) {
            goodPairs = goodPairs + frequency[i];
            frequency[i]++;
        }

        return goodPairs;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3};
        int[] ans = new int[]{numIdenticalPairs(arr)};
        System.out.println(Arrays.toString(ans));
    }


}

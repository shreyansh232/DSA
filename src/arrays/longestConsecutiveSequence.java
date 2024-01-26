package arrays;

import java.util.*;

public class longestConsecutiveSequence {
    //Better
//    public int longestConsecutive(int[] nums) {
//        int n = nums.length;
//        if(n == 0) return 0;
//        Arrays.sort(nums);
//        int longest = 1, cnt = 0, lastSmaller = Integer.MIN_VALUE;
//        for(int i = 0; i < n; i++){
//            if(nums[i] - 1 == lastSmaller){
//                cnt++;
//                lastSmaller = nums[i];
//            }
//            else if(nums[i] != lastSmaller){
//                cnt = 1;
//                lastSmaller = nums[i];
//            }
//            longest = Math.max(longest, cnt);
//        }
//        return longest;
//
//    }
    //Optimal
    public static int longestConsecutive(int[] nums){
        int n = nums.length;
        if(n == 0) return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        for(int j : set){
            if (!set.contains(j - 1)) {
                int cnt = 1;
                int x = j;
                while(set.contains(x + 1)){
                    x++;
                    cnt++;
                }

                longest = Math.max(longest, cnt);
            }

        }
        return longest;

    }
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestConsecutive(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }


}

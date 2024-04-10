package bitmanipulation;

import java.util.*;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int totalSubsets = (int) Math.pow(2,n);

        for(int i = 0; i < totalSubsets; i++){
            List<Integer> subsets = new ArrayList<>();

            for(int j = 0; j < n; j++){
                if((i & ( 1 << j)) != 0){
                    subsets.add(nums[j]);
                }
            }
            result.add(subsets);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}

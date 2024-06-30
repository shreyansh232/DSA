package StriverSDESheet;

import java.util.Arrays;

public class NextPermutation {
    public static void next(int[] nums){
        int n = nums.length;
        int breakInd = -1;

        // Step 1: Find the break point
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                breakInd = i;
                break;
            }
        }
        // Step 2: If no break point, reverse the array and return
        if(breakInd == -1){
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element and swap
        for(int i = n - 1; i > breakInd; i--){
            if(nums[i] > nums[breakInd]){
                int temp = nums[i];
                nums[i] = nums[breakInd];
                nums[breakInd] = temp;
                break;
            }
        }

        // Step 4: Reverse the right half
      reverse(nums, breakInd + 1, n - 1);

    }
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        NextPermutation ans = new NextPermutation();
        int[] nums = {5,4,1,6,3,2};
        ans.next(nums);
        System.out.println(Arrays.toString(nums));
    }
}

package StriverSDESheet;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void sortColors(int[] nums){
        // TC - O(N) SC - O(1)
        int low = 0, mid = 0, high = nums.length - 1;
        for(int i : nums){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }

    }

    public static void main(String[] args) {
        DutchNationalFlag solution = new DutchNationalFlag();
        int[] nums = {0,1,2,1,0,2,0};
        solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
}

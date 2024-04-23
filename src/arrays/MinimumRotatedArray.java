package arrays;

public class MinimumRotatedArray {
    public static int findMin(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        for(int i = 0; i < n; i++){
            min = Math.min(min, nums[i]);

        }
        int low = 0, high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == min) return min;
            if(nums[low] <= nums[mid]){
                if(nums[low] <= min && min <= nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(nums[mid] <= min && min <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {7,6,5,4,1,2,3,4};
        System.out.println(findMin(nums));
    }
}

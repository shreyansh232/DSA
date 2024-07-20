package arrays;

public class MaxConsecutiveOnes3 {
    public static int maxConsececutiveOnes3(int[] nums, int k){
        int left = 0, maxLen = 0, zeroCount = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeroCount++;
            }
            while(zeroCount > 2){
                if(nums[left] == 0){
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1,0,0,1,1,0,0};
        int k = 2;
        System.out.println(maxConsececutiveOnes3(nums, 2));

    }
}

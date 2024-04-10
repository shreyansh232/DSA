package bitmanipulation;

public class SingleNumber {
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ nums[i];

        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

}

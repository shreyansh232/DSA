package bitmanipulation;

public class SingleNumber3 {


    public int[] singleNumber(int[] nums) {
        long xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }

        // Find the rightmost set bit of xor
        int rightmostSetBit = (int) (xor & -xor); // Equivalent to xor & (~xor + 1)

        int b1 = 0, b2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                b1 ^= num;
            } else {
                b2 ^= num;
            }
        }

        return new int[]{b1, b2};
    }


}

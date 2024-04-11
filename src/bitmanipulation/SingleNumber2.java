package bitmanipulation;

public class SingleNumber2 {
    public static int singleNumber(int[] nums) {

        int ans = 0;
        for(int i = 0; i < 32; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if ((nums[j] & (1 << i)) != 0) {
                    count++;
                }
            }
            if(count % 3 == 1){
                ans |= (1 << i);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1, 2 , 3,3, 3};
        System.out.println(singleNumber(nums));
    }

}

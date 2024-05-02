package arrays;

public class MinDaysBouquets {
    public static boolean possible(int[]nums ,int day , int m , int k ){

        int count = 0;
        int NoB = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] <= day){
                count++;
            }else{
                NoB += (count/k);
                count = 0;
            }
        }
        NoB += (count/k);
        return NoB >= m ;
    }


    public static int minDays(int[] nums, int m, int k) {


        //Brute Force:
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i = 0; i < nums.length; i++){
//            max = Math.max(max, nums[i]);
//            min = Math.min(min, nums[i]);
//        }
//        for(int i = min; i <= max; i++){
//            if(possible(nums, i, m, k) == true){
//                return i;
//            }
//        }
//        return -1;



        long val = (long) m*k;
        if(val > nums.length){
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            low = Math.min( nums[i] , low);
            high = Math.max ( nums[i] , high);
        }

        int ans = 0;
        while(low <= high){
            int mid = (high+low)/2;
            if( possible(nums , mid , m , k )){
                ans= mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,5,6};
        int m = 2;
        int k = 2;
        System.out.println(minDays(nums, m, k));
    }
}

package arrays;


import java.util.HashMap;
import java.util.Map;

public class CountSubarraySum {
//    public static int subarraySum(int[] nums, int k) {
//        int count = 0;
//        for(int i = 0; i < nums.length; i++){
//            int sum = 0;
//            for(int j = i; j < nums.length; j++){
//                sum = sum + nums[j];
//                if(sum == k){
//                    count++;
//
//                }
//            }
//        }
//        return count;
//
//    }
public static int findAllSubarraysWithGivenSum(int arr[], int k) {
    int n = arr.length; // size of the given array.
    Map<Integer,Integer> mpp = new HashMap<>();
    int preSum = 0, cnt = 0;

    mpp.put(0, 1); // Setting 0 in the map.
    for (int i = 0; i < n; i++) {
        // add current element to prefix Sum:
        preSum += arr[i];

        // Calculate x-k:
        int remove = preSum - k;

        // Add the number of subarrays to be removed:
        cnt += mpp.getOrDefault(remove, 0);

        // Update the count of prefix sum
        // in the map.
        mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
    }
    return cnt;
}

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }

}

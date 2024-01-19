package arrays;

public class maxSubarray {
    public static int maxSubarraySum(int[] arr, int n) {
        //Brute
//        int maxi = Integer.MIN_VALUE; // maximum sum
//        for(int i = 0; i < n; i++){
//            for(int j = i; j < n; j++){
//                int sum = 0;
//                for(int k = i; k <= j; k++){
//                    sum = sum + arr[k];
//                }
//                maxi = Math.max(maxi, sum);
//            }
//        }
//        return maxi;
        //Better
//        int maxi = Integer.MIN_VALUE; // maximum sum
//        for(int i = 0; i < n; i++){
//                int sum = 0;
//            for(int j = i; j < n; j++){
//                    sum = sum + arr[j];
//                maxi = Math.max(maxi, sum);
//            }
//        }
//        return maxi;

        int maxi = Integer.MIN_VALUE; // maximum sum
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;

    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}

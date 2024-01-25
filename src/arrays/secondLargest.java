package arrays;

import java.util.Arrays;

public class secondLargest {
//    public static void main(String[] args) {
//        int[] arr = {3,1,4,5,6,9,2};
//        secondLargest(arr);
//
//    }
//    static void secondLargest(int[] arr){
//        int largest = arr[0];
//        for (int i = 0; i< arr.length - 1; i++){
//            if (arr[i]>largest){
//                largest = arr[i];
//            }
//        }
//        int sL = -1;
//        for (int i = 0; i < arr.length - 1; i++){
//            if (sL<arr[i] && arr[i] != largest){
//                sL=arr[i];
//            }
//        }
//        System.out.println(sL);
//    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,5,6,9,2};
        int n = arr.length;
        int[] ans = getSecondOrderElements(n, arr);
        System.out.println(Arrays.toString(ans));


    }
    public static int[] getSecondOrderElements(int n, int[] arr) {
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            // Check for the maximum elements
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }

            // Check for the minimum elements
            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            } else if (arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }

        return new int[] {secondMax, secondMin};
    }

}

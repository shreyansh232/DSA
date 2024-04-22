package arrays;

import java.util.Arrays;

public class FirstLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums, target);
        if (first == -1) return new int[] { -1, -1};
        int last = lastOccurrence(nums, target);
        return new int[] {first, last};
    }

    public static int firstOccurrence(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int k) {
        int n = arr.length;

        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                last = mid;
                // look for larger index on the right
                low = mid + 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return last;
    }


    public static void main(String[] args) {
        int[] nums = {1,23,34,5,7, 3, 7};
        int target = 3;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

}

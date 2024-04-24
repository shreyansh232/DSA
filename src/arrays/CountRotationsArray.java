package arrays;

public class CountRotationsArray {
    public static int findKRotation(int []arr){
    int low = 0;
    int high = arr.length - 1;
    int ans = Integer.MAX_VALUE;
    int index = -1;
        while(low<=high)

    {
        int mid = low + (high - low) / 2;

        if (arr[low] <= arr[high]) {
            if (arr[low] < ans) {
                index = low;
                ans = arr[low];
            }
            break;
        }


        //if left part is sorted
        if (arr[low] <= arr[mid]) {
            if (arr[low] < ans) {
                index = low;
                ans = arr[low];
            }
            //eliminate left part
            low = mid + 1;
        }
        //if right part is sorted
        else {
            if (arr[mid] < ans) {
                index = mid;
                ans = arr[mid];
            }
            //eliminate right part
            high = mid - 1;
        }
    }
        return index;
}
    public static void main(String[] args) {
        int[] nums = {7,6,5,4,1,2,3,4};
        System.out.println(findKRotation(nums));
    }
}

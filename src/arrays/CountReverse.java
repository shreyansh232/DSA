package arrays;

public class CountReverse {
    private long count = 0;

    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return (int) count;
    }

    private void mergeSort(int[] nums, int left, int right){
        if(left < right){
            int mid = left + (right - left)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);
            merge(nums, left, mid, right);
        }
    }
    private void merge(int[] nums, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int i = left; int j = mid + 1; int k = 0;
        while(i <= mid && j <= right){
            if((long)nums[i] > 2 * (long)nums[j] ){
                count += mid - i + 1;
                j++;
            } else{
                i++;
            }

        }
        i = left;
        j = mid + 1;
        while(i <= mid && j <= right){
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        while(j <= right){
            temp[k++] = nums[j++];
        }

        for (i = 0; i < temp.length; i++) {
            nums[left + i] = temp[i];
        }
    }


}

package arrays;

public class setMismatch {
    public int[] findErrorNums(int[] nums) {
        //Brute
        // int[] arr = new int[2];
        // HashSet<Integer> set = new HashSet<Integer>();
        // int n = nums.length;

        // for (int i = 0; i < n; i++) {
        //     if (!set.add(nums[i])) {
        //         arr[0] = nums[i];
        //     }
        // }


        // for (int i = 1; i <= n; i++) {
        //     if (!set.contains(i)) {

        //         arr[1] = i;
        //         break;
        //     }
        // }

        // return arr;
        int i =0;

        int[] arr = new int[2];

        while(i<nums.length){

            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for(int j=0; j<nums.length; j++){

            if(nums[j] != j+1){
                arr[0] = nums[j];
                arr[1] = j+1;
            }
        }

        return arr;

    }

    void swap(int[] arr, int first, int second){
        int temp = arr[ first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

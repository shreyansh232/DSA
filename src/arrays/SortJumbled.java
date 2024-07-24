package arrays;
import java.util.*;

public class SortJumbled {
    public static int[] convert(int[] mapping, int[] nums){
        int n = nums.length;
        int[] newSys = new int[n];
        for(int j = 0; j < n; j++){
            int num = nums[j];
            if(num == 0){
                newSys[j] = mapping[0];
                continue;
            }
            int i = 0;
            int res = 0;
            while(num > 0){
                int d = num % 10; //extraction
                int newD = mapping[d]; //conversion
                res = newD * (int)Math.pow(10, i) + res; //formation
                num = num/10; //removal
                i++; //move to the next power
            }
            newSys[j] = res;
        }
        return newSys;
    }
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[] newSys = convert(mapping, nums);
        Integer[] index = new Integer[n];
        for(Integer i = 0; i < n; i++){
            index[i] = i;
        }
        Arrays.sort(index, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return newSys[a] - newSys[b];
            }
        });
        int[] res = new int[n];
        int i = 0;
        for(int ind : index){
            res[i] = nums[ind];
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] x = {8,9,4,0,2,1,3,5,7,6};
        int[] y = {991,338,38};
        System.out.println(Arrays.toString(sortJumbled(x, y)));
    }
}

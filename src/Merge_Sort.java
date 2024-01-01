import java.util.*;
public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,7,8};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int [] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }
    public static int [] merge(int[] first, int[] second){
        int[] add = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length){
            if (first[i] < second[j]) {
                add[k] = first[i];
                i++;
            }
            else{
                add[k] = second[j];
                j++;
            }
            k++;

        }
        //maybe possible that one of the arrays isn't complete then just copy the remaining elements in the array
        while(i < first.length){
            add[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            add[k] = second[j];
            j++;
            k++;
        }
        return add;
    }
}

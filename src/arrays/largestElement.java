package arrays;

public class largestElement {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,6,9,2};
        largest(arr);

    }
    static void largest(int[] arr){
        int largest = arr[0];
        for (int i = 0; i< arr.length - 1; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }

}

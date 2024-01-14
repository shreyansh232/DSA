package arrays;

public class Second_Largest {
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
        secondLargest(arr);

    }
    static void secondLargest(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }

        }
        int sL = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > sL && arr[i] != largest){
                sL = arr[i];
            }
        }
        System.out.println(sL);
    }

}

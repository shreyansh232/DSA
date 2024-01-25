package arrays;

public class leftRotateK {
    //Brute
//    public static void Rotatetoleft(int[] arr, int n, int k) {
//       if(n == 0){
//           return;
//       }
//       k = k % n;
//       if (k > n){
//           return;
//       }
//       int[] temp = new int[k];
//       for (int i = 0; i < k; i++){
//           temp[i] = arr[i];
//
//       }
//       for (int i = 0; i < n - k; i++ ){
//           arr[i] = arr[i + k];
//       }
//       for (int i = n - k; i < n; i++ ){
//           arr[i] = temp[i - ( n - k )];
//       }
//
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7};
//        int n = arr.length;
//        int k = 2;
//        Rotatetoleft(arr, n, k);
//        System.out.println("After Rotating the elements to left ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }


    //Optimal
 public static void reverse(int[] arr, int start, int end){
     while(start <= end){
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
     }
 }
 public static void Rotateeletoleft(int[]arr, int n, int k){
     reverse(arr, 0, k-1);
     reverse(arr, k, n-1);
     reverse(arr, 0, n-1);
 }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 2;
        Rotateeletoleft(arr, n, k);
        System.out.print("After Rotating the k elements to left ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



}

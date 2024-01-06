package arrays;
import java.util.*;

public class Move_Zeroes {
    //brute
//    public static int[] moveZeros(int[] a) {
//       ArrayList<Integer> temp = new ArrayList<>();
//       for (int i : a){
//           if (a[i] != 0){
//               temp.add(a[i]);
//
//           }
//       }
//       int nz = temp.size();
//       for (int i = 0; i < nz; i++){
//           a[i] = temp.get(i);
//       }
//       for (int i = nz; i < a.length; i++){
//           a[i] = 0;
//       }
//       return a;
//
//
//       }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
//        int n = arr.length;
//        int[] ans = moveZeros(arr);
//        for (int i = 0; i < n; i++) {
//            System.out.print(ans[i] + " ");
//        }
//        System.out.println(" ");
//    }
    //optimal
    public static int[] moveZeros( int []a) {
        int j = -1;
        for (int i = 0; i < a.length; i++){
            if (a[i] == 0){
                j = i;
                break;
            }
        }
        if (j == -1) return a;
        for (int i = j+1; i < a.length; i++ ){
            if (a[i] != 0 ){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }


        }
        return a;

    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = arr.length;
        int[] ans = moveZeros( arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println(" ");
    }



}

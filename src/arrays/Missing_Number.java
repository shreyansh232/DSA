package arrays;


//Brute approach
public class Missing_Number {
//    public static int missingNumber(int[] arr, int N){
//
//       for(int i = 1; i < N; i++){
//           int flag = 0;
//           for (int j = 0; j < N-1; j++){
//               if (arr[j] == i) {
//                   flag = 1;
//                   break;
//               }
//}
//               if (flag == 0) return i;
//
//           }
//        return N;
//    }
//
//    public static void main(String[] args) {
//        int N = 5;
//        int[] arr = {1, 2, 4, 5};
//
//        int ans = missingNumber(arr, N);
//        System.out.println("The missing number is: " + ans);
//    }
    public static int missingNumber(int[] a, int N){int xor1 = 0, xor2 = 0;
        for (int i = 0; i < N-1; i++){
            xor2 = xor2^a[i];
            xor1 = xor1^(i+1);
        }
        xor1 = xor1 ^ N;

        return (xor1 ^ xor2);

    }
    public static void main(String[] args) {
        int N = 5;
        int[] a = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

}

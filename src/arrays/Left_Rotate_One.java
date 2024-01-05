package arrays;

public class Left_Rotate_One {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,6,9,2};
        int n = arr.length;
        rotate(arr, n);

    }
    static void rotate(int[] arr, int n){

        int temp = arr[0];

        for (int i = 1; i < n ; i++ ){

            arr[i-1] = arr[i];

        }
        arr[n - 1] = temp;

        for (int i = 0; i < n; i++){

            System.out.print(arr[i]);

        }

    }

}

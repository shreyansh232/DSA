package arrays;


public class Number_appears_once {
    //optimal
    public static int number(int[] arr) {
        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];

        }


        return xor;


    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = number(arr);
        System.out.println("The single element is: " + ans);

    }
}

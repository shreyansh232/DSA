public class Bubble_Sort {
    public static void bubbleSort(int[] arr, int n) {
        for (int i = n - 1; i > 0; i--) {

            for (int j = 0; j < i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }
            }

        }
        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }


    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        bubbleSort(arr, n);

    }

}

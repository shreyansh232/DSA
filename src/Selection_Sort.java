public class Selection_Sort{
    static void selection_sort(int[] arr, int n) {
        for (int i = 0; i < n-1; i++){
            int mini = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[mini]){
                    mini = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
        System.out.println("After selection sort: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        selection_sort(arr, n);
    }
}

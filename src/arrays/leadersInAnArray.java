package arrays;

import java.util.ArrayList;

public class leadersInAnArray {
//    brute
//    public static ArrayList<Integer> leaders(int[] arr){
//        int n = arr.length;
//        ArrayList<Integer> ans = new ArrayList<>();
//        for(int i = 0; i < n; i++) {
//            boolean leader = true;
//            for (int j = i + 1; j < n; j++){
//                if (arr[j] > arr[i]) {
//                    leader = false;
//                    break;
//
//                }
//        }
//                if(leader)
//                    ans.add(arr[i]);
//
//
//
//
//
//
//        }
//        return ans;
//
//    }
public static ArrayList<Integer> leaders(int []a) {
    int n = a.length;
    ArrayList<Integer> ans = new ArrayList<>();
    int max = Integer.MIN_VALUE;
    for(int i = n-1; i >= 0; i-- ){
        if(a[i] > max){
            ans.add(a[i]);
            max = a[i];

        }

    }
    return ans;
}

    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6};


        ArrayList<Integer> ans = leaders(arr);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}

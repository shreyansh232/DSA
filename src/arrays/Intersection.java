package arrays;

import java.util.ArrayList;

public class Intersection {
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> intersec = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {  // Add elements to intersection when they match
                intersec.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {  // Move the smaller pointer to find potential matches
                i++;
            } else {
                j++;
            }
        }
        return intersec;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> intersection = intersection(arr1, arr2);
        System.out.println("Intersection of arr1 and arr2 is ");
        for (int val : intersection) {
            System.out.print(val + " ");
        }
    }
}
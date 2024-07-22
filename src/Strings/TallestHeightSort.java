package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class TallestHeightSort {
    public static String[] heightSort(String[] names, int[] heights){
        HashMap<Integer, String> map = new HashMap<>();
        String[] res = new String[names.length];
        int index = 0;
        for(int i = 0; i < names.length; i++){
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for(int i = heights.length - 1; i >= 0; i--){
            res[index] = map.get(heights[i]);
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(heightSort(names, heights)));
    }

}

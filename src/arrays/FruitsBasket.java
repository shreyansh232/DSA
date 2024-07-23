package arrays;
import java.util.*;

public class FruitsBasket {
    public static int totalFruits(int[] fruits){
        int left = 0, maxLen = 0;
        int n = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < n; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] x = {0,1,2,2};
        System.out.println(totalFruits(x));
    }

}

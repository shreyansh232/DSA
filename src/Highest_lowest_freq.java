import java.util.HashMap;
import java.util.Map;

public class Highest_lowest_freq {
//    public static void main(String[] args) {
//        int[] arr = {10, 5, 10, 3, 4, 4, 10};
//        int n = arr.length;
//        countFrequency(arr, n);
//    }
//    public static void countFrequency(int[] arr, int n){
//        boolean[] visited = new boolean[n];
//        int maxFreq = 0, minfreq = n;
//        int maxEle = 0, minEle = 0;
//        for(int i = 0; i < n; i++ ){
//
//            if(visited[i] == true){
//                continue;
//            }
//
//            int count = 1;
//            for(int j = i +1; j < n; j++){
//                if(arr[i] == arr[j]){
//                    visited[j] = true;
//                    count++;
//                }
//            }
//            if (count > maxFreq ){
//                maxEle = arr[i];
//                maxFreq = count;
//
//            }
//            if (count < minfreq){
//                minfreq = count;
//                minEle = arr[i];
//            }
//
//        }
//        System.out.println("Highest Freq element:" + maxEle);
//        System.out.println("Lowest Freq element:" + minEle);
//
//
//    }
        public static void main(String[] args) {
        int[] arr = {10, 5, 10, 3, 4, 4, 10};
        int n = arr.length;
        countFrequency(arr, n);
    }
    public static void countFrequency(int[] arr, int n){
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i<n; i++) {
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }
                int maxFreq = 0, minFreq = n;
                int maxEle = 0, minEle = 0;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                    int count = entry.getValue();
                    int element = entry.getKey();
                    if (count > maxFreq){
                        maxEle = element;
                        maxFreq = count;
                    }
                    if (count < minFreq){
                        minEle = element;
                        minFreq = count;
                    }

                }
        System.out.print(maxEle + " ");
        System.out.println(minEle);

            }
    }







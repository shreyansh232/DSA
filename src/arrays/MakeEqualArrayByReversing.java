package arrays;

public class MakeEqualArrayByReversing {
    public static boolean canBeEqual(int[] target, int[] arr) {
        int n = target.length, m = arr.length;
        int[] map = new int[1001];
        for(int i = 0; i < n; i++){
            map[target[i]]++;
            map[arr[i]]--;
        }
        for(int i = 0; i < n; i++){
            if(map[target[i]] != 0 || map[arr[i]] != 0){
                return false;
            }
        }
        return true;
    }
}

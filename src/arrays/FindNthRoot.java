package arrays;

public class FindNthRoot {
    public static int NthRoot(int n, int m) {
        int low = 1, high = m;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low)/2;
            int val = (int)Math.pow(mid, n);
            if(val == m){
                ans = mid;
                break;

            }
            else if(val < m){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int n = 4;
        int m = 81;
        System.out.println(NthRoot(n, m));
    }
}

package arrays;

public class SquareRoot {
    public static int sqrtN(long N) {
        if(N == 0) return 0;
        long low = 0, high = N;
        long ans = 0;
        while(low <= high){
            long mid = low + (high - low)/2;
            long sqaure = mid * mid;
            if(sqaure <= N){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return (int)high;
    }
    public static void main(String[] args) {
        long N = 64;
        System.out.println(sqrtN(N));
    }
}

package arrays;

public class KokoBanana {
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = max(piles);
        while(low <= high){
            int mid = low + (high - low)/2;
            int totalH = total(piles, mid);

            if(totalH <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static int max(int[] piles){
        int high = 0;
        for(int i : piles){
            high = Math.max(high, i);
        }
        return high;

    }
    public static int total(int[] piles, int mid){
        int totalH = 0;
        for(int i = 0; i < piles.length; i++){
            totalH += Math.ceil((double)piles[i]/(double)mid);
        }
        return totalH;
    }

    public static void main(String[] args) {
        int[] piles = {3, 4, 5, 8, 10};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

}

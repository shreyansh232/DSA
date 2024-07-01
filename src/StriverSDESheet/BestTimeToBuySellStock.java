package StriverSDESheet;

public class BestTimeToBuySellStock {
    // TC - O(N) SC - O(1)
    public static int buySell(int[] prices){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {1,4,5,6,7,8};
        System.out.println(buySell(prices));
    }
}

package atif.leetCode.blind75;

/*You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4,11};
        maxProfit(prices);
    }

    private static void maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int i=0; i<prices.length;i++){
            for (int j=i+1;j<prices.length;j++){
                profit = Math.max(profit, prices[j] - prices[i]);
            }
        }
        System.out.println(profit);
    }
}

package easy;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimetoBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        if (prices.length == 1) return 0;

        int max = 0;
        int maxSoFar = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            maxSoFar = Math.max(maxSoFar, prices[i]);
            max = Math.max(max, maxSoFar - prices[i]);
        }

        return max;
    }
}

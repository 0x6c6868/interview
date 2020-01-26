package CodingInterviews;

// leetcode 121
public class _63_MaximalProfit {

  public int maxProfit(int[] prices) {
    int maxProfit = 0, minPrice = Integer.MAX_VALUE;

    for (int i = 0; i < prices.length; i++) {
      minPrice = Math.min(minPrice, prices[i]);
      maxProfit = Math.max(maxProfit, prices[i] - minPrice);
    }
    return maxProfit;
  }
}

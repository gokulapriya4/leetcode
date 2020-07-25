package main.java.com.priya.leetcode.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0, buy = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (i == prices.length - 1 || prices[i] > prices[i + 1]) {
                maxProfit += prices[i] - buy;
                buy = Integer.MAX_VALUE;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(obj.maxProfit(prices));
    }
}

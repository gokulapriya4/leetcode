package main.java.com.priya.leetcode.DynamicProgramming;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/572/
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 1};
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        System.out.println(obj.maxProfit(arr));
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0, minElement = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minElement) {
                minElement = prices[i];
            } else if (prices[i] - minElement > maxProfit) {
                maxProfit = prices[i] - minElement;
            }
        }
        return maxProfit;
    }

}

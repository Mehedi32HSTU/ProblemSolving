package org.example;

/**
 * Problem Name: 121. Best Time to Buy and Sell Stock
 * Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 * Date: 30.05.2024
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;
        int length = prices.length;
        for (int price : prices) {
            minValue=Math.min(minValue, price);
            maxProfit=Math.max(maxProfit, price-minValue);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] prices = {6,5,4,3,2,1};
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(prices));
    }
}

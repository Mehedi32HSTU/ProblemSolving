package org.example;

/**
 * Problem Name: 122. Best Time to Buy and Sell Stock II
 * Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 * Date: 03.06.2024
 */
public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int bought=Integer.MAX_VALUE;
        int length = prices.length;
        for (int price : prices) {
            if(bought > price)
                bought=price;
            else {
                maxProfit+=price-bought;
                bought=price;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock2 bestTimeToBuyAndSellStock2 = new BestTimeToBuyAndSellStock2();
        int[] prices = {7,6,4,3,1};
        System.out.println(bestTimeToBuyAndSellStock2.maxProfit(prices));
    }
}

package org.example;

import java.util.Arrays;

/**
 * Problem Name: 135. Candy
 * Problem Link: https://leetcode.com/problems/candy/description/
 * Date: 28.10.2024
 */
public class Candy {
    public int candy(int[] ratings) {
        int totalCandies = ratings.length;
        int ratingLen = ratings.length;
        int[] candies = new int[totalCandies];
        Arrays.fill(candies, 1);
        for(int i=1; i<ratingLen; i++) {
            if(ratings[i]>ratings[i-1]) {
                totalCandies = totalCandies - candies[i];
                candies[i] = candies[i-1]+1;
                totalCandies = totalCandies + candies[i];
            }
        }
        for(int i=(ratingLen-1)-1; i>=0; i--) {
            if(ratings[i]>ratings[i+1]) {
                totalCandies = totalCandies - candies[i];
                candies[i] = Math.max(candies[i], candies[i+1]+1);
                totalCandies = totalCandies + candies[i];
            }
        }
        return totalCandies;
    }


    public static void main(String[] args) {
        Candy candy = new Candy();
//        int [] ratings = {1,0,2};                                                                            // 5
//        int [] ratings = {1,2,2};                                                                            // 4
//        int [] ratings = {60, 80, 100, 100, 100, 100, 100};                                                 // 10
        int [] ratings = {1,3,4,5,2};                                                                         // 11
//        int [] ratings = {100, 80, 70, 60, 70, 80, 90, 100, 90, 80, 70, 60, 60};                             // 35
//        int [] ratings = {6, 7, 6, 5, 4, 3, 2, 1, 0, 0, 0, 1, 0};                                            // 42
        /*int [] ratings = {20000, 20000, 16001, 16001, 16002, 16002, 16003, 16003, 16004, 16004, 16005, 16005, 16006,
                16006, 16007, 16007, 16008, 16008, 16009, 16009, 16010, 16010, 16011, 16011, 16012, 16012, 16013, 16013,
                16014, 16014, 16015, 16015, 16016, 16016, 16017, 16017, 16018, 16018, 16019, 16019, 16020, 16020, 16021,
                16021, 16022, 16022, 16023, 16023, 16024, 16024};*/                                            // 74
        System.out.println(candy.candy(ratings));

    }
}

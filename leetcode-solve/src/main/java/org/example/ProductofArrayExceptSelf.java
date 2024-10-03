package org.example;

/**
 * Problem Name: 238. Product of Array Except Self
 * Problem Link: https://leetcode.com/problems/product-of-array-except-self/description/
 * Date: 02.10.2024
 */
public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answerArray = new int[nums.length];
        int multiplication = 1;
        answerArray[0] = multiplication;
        for (int i=1;i<nums.length;i++) {
            multiplication *= nums[i-1];
            answerArray[i]=multiplication;
        }
        multiplication=1;
        for (int i = nums.length-2; i>=0;i--) {
            multiplication *= nums[i+1];
            answerArray[i] = multiplication * answerArray[i];
        }
        return answerArray;
    }


    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3}; // 1,2,3,4 // -1,1,0,-3,3
        ProductofArrayExceptSelf productofArrayExceptSelf = new ProductofArrayExceptSelf();
        int[] ans = productofArrayExceptSelf.productExceptSelf(nums);
        for (int item : ans) {
            System.out.print(item+" ");
        }
    }
}

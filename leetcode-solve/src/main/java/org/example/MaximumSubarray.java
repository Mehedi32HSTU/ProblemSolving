package org.example;


/**
 * Problem Name: 53. Maximum Subarray
 * Problem Link: https://leetcode.com/problems/maximum-subarray/description/
 * Date: 16.09.2024
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = 0, currentMax = 0;
        maxSum = currentMax = nums[0];
        for(int i=1;i<nums.length;i++) {
            currentMax = Math.max(currentMax+nums[i], nums[i]);
            maxSum = Math.max(maxSum, currentMax);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maximumSubarray.maxSubArray(arr));
    }
}

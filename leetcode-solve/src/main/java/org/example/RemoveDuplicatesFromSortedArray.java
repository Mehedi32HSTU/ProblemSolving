package org.example;

/**
 * Problem Name: 26. Remove Duplicates from Sorted Array
 * Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * Date: 26.05.2024
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int right=0;
        int length = nums.length;
        if(length==0 || length==1) return length;
        for(right=1;right<length;right++) {
            if(nums[left]!=nums[right]) {
                left++;
                nums[left] = nums[right];
            }
        }
        /*
        for (int num : nums) {
            System.out.print(num+" ");
        }
        System.out.println("\n" + (left+1));
        */
        return left+1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicatesFromSortedArray.removeDuplicates(nums);
    }
}

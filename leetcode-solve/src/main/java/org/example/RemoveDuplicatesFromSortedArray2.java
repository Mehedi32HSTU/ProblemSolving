package org.example;


/**
 * Problem Name: 80. Remove Duplicates from Sorted Array II
 * Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
 * Date: 26.05.2024
 */
public class RemoveDuplicatesFromSortedArray2 {

    public int removeDuplicates(int[] nums) {
        int left=0;
        int right=0;
        int length = nums.length;
        int maxAllowedFrequency=2;
        int frequency=1;
        if(length==0 || length==1) return length;
        for(right=1;right<length;right++) {
            if(nums[left]!=nums[right]) {
                frequency=1;
                left++;
                nums[left] = nums[right];
            } else if(nums[left]==nums[right] && frequency<maxAllowedFrequency) {
                frequency++;
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
        RemoveDuplicatesFromSortedArray2 removeDuplicatesFromSortedArray2 = new RemoveDuplicatesFromSortedArray2();
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {0,0,1,1,1,1,2,3,3};
        int[] nums = {1,1,1,2,2,3};
        removeDuplicatesFromSortedArray2.removeDuplicates(nums);
    }
}

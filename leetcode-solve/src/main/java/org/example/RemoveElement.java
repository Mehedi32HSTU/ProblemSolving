package org.example;


/**
 * Problem Name: 27. Remove Element
 * Problem Link: https://leetcode.com/problems/remove-element/description/
 * Date: 26.05.2024
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        int count=nums.length;
        while(i<=j) {
            if(nums[j]==val) {count--; j--;}
            else if(nums[i]==val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;j--;
                count--;
            } else i++;
        }
        /*
        for (int num : nums) {
            System.out.print(num+" ");
        }
        System.out.print("\n" + count);
        */
        return count;
    }


    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {0,1,2,2,3,0,4,2};
        removeElement.removeElement(nums,2);
        System.out.println();
        int[] nums2 = {3,2,2,3};
        removeElement.removeElement(nums2,3);
    }
}

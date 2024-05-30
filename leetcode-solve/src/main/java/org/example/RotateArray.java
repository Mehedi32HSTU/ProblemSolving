package org.example;



/**
 * Problem Name: 189. Rotate Array
 * Problem Link: https://leetcode.com/problems/rotate-array/description/
 * Date: 29.05.2024
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k=k%length;
        if(k!=0) {
            rotateArray(nums,0, (length-k-1));
            rotateArray(nums,(length-k), length-1);
            rotateArray(nums, 0, length-1);
        }
    }
    public void rotateArray(int[] nums, int left, int right) {
        while(left<=right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        rotateArray.rotate(nums, 13);
    }

}

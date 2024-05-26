package org.example;

/**
 * Problem Name: 88. Merge Sorted Array
 * Problem Link: https://leetcode.com/problems/merge-sorted-array/description/
 * Date: 21.05.2024
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=(m+n)-1;
        for( ;i>=0 && j>=0;) {
            if(nums1[i]>=nums2[j]) {
                nums1[k]=nums1[i];
                i--;
                k--;
            } else {
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        if(i>0) {
            while(i>=0) {
                nums1[k] = nums1[i];
                i--;
                k--;
            }
        } else if(j>0) {
            while(j>=0) {
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        for (int num : nums1) {
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        mergeSortedArray.merge(nums1,3,nums2,3);
    }

}

package org.example;

import java.util.Arrays;

/**
 * Problem Name: 274. H-Index
 * Problem Link: https://leetcode.com/problems/h-index/description/
 * Date: 25.06.2024
 */
public class H_Index {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int maxCitation=0;
        int length = citations.length;
        if(length==1) return Math.min(length, citations[0]);

        for(int i=0;i<length;i++) {
            if(!(citations[length - (i+1)] >= i+1) )
                return i;
        }
        return length;
    }
    public static void main(String[] args) {
        H_Index hIndex = new H_Index();
        int[] nums={1,1,1,1,2,2,2,3,3,4,4,4,3,5,5,2,5};
        System.out.println(hIndex.hIndex(nums));
    }
}

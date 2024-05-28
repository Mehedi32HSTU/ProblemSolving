package org.example;

/**
 * Problem Name: 169. Majority Element
 * Problem Link: https://leetcode.com/problems/majority-element/description/
 * Date: 28.05.2024
 */
public class MajorityElement {

    public int findMajorityElement(int[] nums) {
        int candidate=-1;
        int currentFrequency=0;
        for (int num : nums) {
            if(currentFrequency==0) {
                candidate=num;
                currentFrequency=1;
            } else {
                if(num==candidate) currentFrequency++;
                else currentFrequency--;
            }
        }
        int count=0;
        for (int num : nums) {
            if(num==candidate) count++;
        }
        if(count > nums.length/2) return candidate;
        else return -1;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement.findMajorityElement(nums));
    }
}
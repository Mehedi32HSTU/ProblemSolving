package org.example;

/**
 * Problem Name: 45. Jump Game II
 * Problem Link: https://leetcode.com/problems/jump-game-ii/description/
 * Date: 05.06.2024
 */
public class JumpGame2 {
    public int jump(int[] nums) {
        int jumpCount=0;
        int len=nums.length;
        int left=0, right=0;
        int farthest=0;
        while(right<len-1){
            farthest=0;
            for(int i=left;i<=right;i++) {
                farthest = Math.max(farthest, i+nums[i]);
            }
            left=right;
            right=farthest;
            jumpCount++;
        }
        return jumpCount;
    }

    public static void main(String[] args) {
        JumpGame2 jumpGame2 = new JumpGame2();
        int[] nums={2,0,2,3,1,0,2,0,1};
        System.out.println(jumpGame2.jump(nums));
    }
}

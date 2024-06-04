package org.example;

/**
 * Problem Name: 55. Jump Game
 * Problem Link: https://leetcode.com/problems/jump-game/description/
 * Date: 04.06.2024
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        int currentPointer=nums.length-1;
        int length=nums.length;
        for(int i=length-1;i>=0;i--) {
            if(nums[i]+i >=currentPointer) currentPointer=i;
        }
        return currentPointer==0;
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] nums={2,0,2,3,1,0,1,0,1};
        System.out.println(jumpGame.canJump(nums));
    }
}

package org.example;

import java.util.Arrays;
import java.util.Objects;

/**
 * Problem Name: 14. Longest Common Prefix
 * Problem Link: https://leetcode.com/problems/longest-common-prefix/description/
 * Date: 09.10.2024
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0) return "";
        Arrays.sort(strs);
        String lcp = "";
        String shortestString = strs[0];
        String longestString = strs[strs.length-1];
        for(int i =0 ;i<shortestString.length();i++) {
            if(!Objects.equals(shortestString.charAt(i), longestString.charAt(i)))
                return shortestString.substring(0, i);
        }
        return shortestString;
    }

    public static void main(String[] args) {
//        String[] strs = {"flower","flow","flight"};
//        String[] strs = { "geeksforgeeks", "geeks", "geek", "geezer" };
        String[] strs = {"dog","racecar","car"};
//        String[] strs = {};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }
}

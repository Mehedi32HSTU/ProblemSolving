package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Problem Name: 58. Length of Last Word
 * Problem Link: https://leetcode.com/problems/length-of-last-word/description
 * Date: 11.12.2024
 */
public class LengthofLastWord {

    public int lengthOfLastWord(String s) {
        String trimmedString = s.trim();
        int length = trimmedString.length();
        int index = length-1;
        int lengthCount=0;
        while(index >= 0 && trimmedString.charAt(index) != ' '){
            index--;
            lengthCount++;
        }
        return lengthCount;
    }

    public static void main(String[] args) {
        LengthofLastWord lengthofLastWord = new LengthofLastWord();
        System.out.println(lengthofLastWord.lengthOfLastWord("x"));
    }
}

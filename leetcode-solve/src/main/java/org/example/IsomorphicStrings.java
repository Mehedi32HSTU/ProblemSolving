package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Problem Name: 238. Product of Array Except Self
 * Problem Link: https://leetcode.com/problems/product-of-array-except-self/description/
 * Date: 03.10.2024
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charHash = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character currentMap = charHash.get(s.charAt(i));
            System.out.println("Char : "+ s.charAt(i)+", Mapped at: "+currentMap);
            if(Objects.isNull(currentMap)) charHash.put(s.charAt(i), t.charAt(i));
            else if(!Objects.equals(currentMap, t.charAt(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
//        String s = "paper", t = "title";
//        String s = "bbbaaaba", t = "aaabbbba";
//        String s = "egg", t = "add";
//        String s = "foo", t = "bar";
        String s = "badc", t = "baba";
        System.out.println(isomorphicStrings.isIsomorphic(s,t));
    }
}

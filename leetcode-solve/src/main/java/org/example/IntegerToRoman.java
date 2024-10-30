package org.example;

/**
 * Problem Name: 12. Integer to Roman
 * Problem Link: https://leetcode.com/problems/integer-to-roman/description/
 * Date: 28.10.2024
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        String [] thousandsMap = {"", "M", "MM", "MMM"};
        String [] hundradesMap = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String [] tensMap = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String [] singleMap = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String romanNumber = thousandsMap[num/1000];
        num%=1000;

        romanNumber += hundradesMap[num/100];
        num%=100;

        romanNumber += tensMap[num/10];
        num%=10;

        romanNumber += singleMap[num];

        return romanNumber;
    }


    public static void main(String[] args) {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        System.out.println(integerToRoman.intToRoman(3749));
    }
}

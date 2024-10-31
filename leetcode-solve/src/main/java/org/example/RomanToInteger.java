package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        String [] romanLetterArray = {"MMM", "MM", "M",
                "CM", "DCCC", "DCC", "DC", "D", "CD", "CCC", "CC", "C",
                "XC", "LXXX", "LXX", "LX", "L", "XL", "XXX", "XX", "X",
                "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I", ""};

        int number = 0;
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("",0);
        numberMap.put("M",1000);
        numberMap.put("MM",2000);
        numberMap.put("MMM",3000);

        numberMap.put("C",100);
        numberMap.put("CC",200);
        numberMap.put("CCC",300);
        numberMap.put("CD",400);
        numberMap.put("D",500);
        numberMap.put("DC",600);
        numberMap.put("DCC",700);
        numberMap.put("DCCC",800);
        numberMap.put("CM",900);

        numberMap.put("X",10);
        numberMap.put("XX",20);
        numberMap.put("XXX",30);
        numberMap.put("XL",40);
        numberMap.put("L",50);
        numberMap.put("LX",60);
        numberMap.put("LXX",70);
        numberMap.put("LXXX",80);
        numberMap.put("XC",90);

        numberMap.put("I",1);
        numberMap.put("II",2);
        numberMap.put("III",3);
        numberMap.put("IV",4);
        numberMap.put("V",5);
        numberMap.put("VI",6);
        numberMap.put("VII",7);
        numberMap.put("VIII",8);
        numberMap.put("IX",9);
        while(!s.isEmpty()) {
            for(int i=0;i<romanLetterArray.length;i++) {
                if(s.startsWith(romanLetterArray[i])) {
                    number+=numberMap.get(romanLetterArray[i]);
                    s = s.replaceFirst(romanLetterArray[i], "");
                    break;
                }
            }
        }
        return number;
    }


    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
//        String romanNumber = "MCMXCIV";
//        String romanNumber = "LVIII";
//        String romanNumber = "MMMDCCXLIX";
//        String romanNumber = "MCMXCIX";
        String romanNumber = "MMMCMXCIX";

        System.out.println(romanToInteger.romanToInt(romanNumber));
    }

}

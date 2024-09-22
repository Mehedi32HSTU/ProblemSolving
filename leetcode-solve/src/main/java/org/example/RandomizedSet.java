package org.example;

import java.util.*;

/**
 * Problem Name: 380. Insert Delete GetRandom O(1)
 * Problem Link: https://leetcode.com/problems/insert-delete-getrandom-o1/description/
 * Date: 17.09.2024
 */
public class RandomizedSet {
    List<Integer> elementsList;
    Map<Integer, Integer> elementsMap;
    Random random = new Random();
    public RandomizedSet() {
        elementsMap = new HashMap<>();
        elementsList = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(elementsMap.containsKey(val))
            return false;
        elementsMap.put(val, elementsList.size());
        elementsList.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!elementsMap.containsKey(val))
            return false;
        int currElmPos = elementsMap.get(val);
        if(currElmPos != elementsList.size()-1) {
            int lastElement = elementsList.get(elementsList.size()-1);
            elementsMap.put(lastElement, currElmPos);
            elementsList.set(currElmPos, lastElement);
        }
        elementsList.remove(elementsList.size()-1);
        elementsMap.remove(val);
        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(elementsList.size());
        return elementsList.get(randomIndex);
    }

}

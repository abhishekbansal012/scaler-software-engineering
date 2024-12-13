package org.pixlaunch.module_04.day_29.assignment.ques_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Solution {
    public ArrayList<Integer> smallestNumber(ArrayList<Integer> A) {

        ArrayList<Integer> sortedArray = new ArrayList<>();
        TreeMap<Integer, Integer> hMap = new TreeMap<>();

        for(int i=0;i<A.size();i++) {
            if(hMap.containsKey(A.get(i))) {
                hMap.put(A.get(i), hMap.get(A.get(i))+1);
            }else{
                hMap.put(A.get(i), 1);
            }
        }

        hMap.forEach((key,value)-> {
            for(int i=0;i<value;i++) {
                sortedArray.add(key);
            }
        });

        return sortedArray;
    }

}

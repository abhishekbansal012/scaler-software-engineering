package org.pixlaunch.module_02.day_06.additional_problems.ques_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public int solve(ArrayList<Integer> A, int B) {
        return findOccurrencesInArray(A, B);
    }

    private int findOccurrencesInArray(ArrayList<Integer> A, int b) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer value: A) {
            if(map.containsKey(value)) {
                map.put(value, map.get(value)+1);
            } else {
                map.put(value, 1);
            }
        }

        if(map.containsKey(b)) {
            return map.get(b);
        }

        return 0;

    }

}

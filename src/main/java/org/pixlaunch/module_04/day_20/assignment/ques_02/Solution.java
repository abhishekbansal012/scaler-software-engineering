package org.pixlaunch.module_04.day_20.assignment.ques_02;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> currentInterval = A.get(0);

        for (int i = 1; i < A.size(); i++) {
            ArrayList<Integer> nextInterval = A.get(i);

            if (currentInterval.get(1) >= nextInterval.get(0)) { // Overlapping intervals
                currentInterval.set(1, Math.max(currentInterval.get(1), nextInterval.get(1)));
            } else { // Non-overlapping interval, add current and move to next
                result.add(new ArrayList<>(currentInterval));
                currentInterval = nextInterval;
            }
        }

        result.add(new ArrayList<>(currentInterval));


        return result;
    }
}

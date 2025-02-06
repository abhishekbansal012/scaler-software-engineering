package org.pixlaunch.module_04.day_20.additional_questions.ques_01;

import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> A,
                                                ArrayList<Integer> B) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int i = 0, n = A.size();

        // Add all intervals that end before the new interval starts
        while (i < n && A.get(i).get(1) < B.get(0)) {
            result.add(A.get(i));
            i++;
        }

        // Merge overlapping intervals
        while (i < n && A.get(i).get(0) <= B.get(1)) {
            B.set(0, Math.min(B.get(0), A.get(i).get(0)));
            B.set(1, Math.max(B.get(1), A.get(i).get(1)));
            i++;
        }
        result.add(B);

        // Add remaining intervals
        while (i < n) {
            result.add(A.get(i));
            i++;
        }
        return result;
    }
}

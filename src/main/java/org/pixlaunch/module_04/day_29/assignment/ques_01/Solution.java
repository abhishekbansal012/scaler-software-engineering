package org.pixlaunch.module_04.day_29.assignment.ques_01;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        return mergeTwoSortedArrays(A, B);
    }

    private ArrayList<Integer> mergeTwoSortedArrays(List<Integer> A, List<Integer> B) {
        ArrayList<Integer> mergedArray = new ArrayList<>();

        int startArrayA = 0;
        int startArrayB = 0;

        while(startArrayA < A.size() && startArrayB < B.size()) {

            if(A.get(startArrayA) < B.get(startArrayB)) {
                mergedArray.add(A.get(startArrayA));
                startArrayA++;
            } else{
                mergedArray.add(B.get(startArrayB));
                startArrayB++;
            }
        }

        while(startArrayA< A.size()) {
            mergedArray.add(A.get(startArrayA));
            startArrayA++;
        }
        while(startArrayB< B.size()) {
            mergedArray.add(B.get(startArrayB));
            startArrayB++;
        }

        return mergedArray;
    }

}

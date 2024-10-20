package org.pixlaunch.module_02.day_06.assignment.ques_5;

import java.util.ArrayList;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        return findSumOfMaxMinElement(A);
    }

    private int findSumOfMaxMinElement(ArrayList<Integer> A) {
        int min = A.get(0);
        int max = A.get(0);

        for (Integer valueOfIthElement : A) {
            if (valueOfIthElement > max) {
                max = valueOfIthElement;
            }

            if (valueOfIthElement < min) {
                min = valueOfIthElement;
            }
        }
        return  min+max;
    }
}
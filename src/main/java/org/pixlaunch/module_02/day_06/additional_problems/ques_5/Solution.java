package org.pixlaunch.module_02.day_06.additional_problems.ques_5;

import java.util.ArrayList;
import java.util.Comparator;

public class Solution {

    public int solve(ArrayList<Integer> A) {

        if (A.isEmpty() || A.size() == 1) {
            return -1;
        }

        // Find the maximum value in the array
        int max = A.stream().max(Comparator.naturalOrder()).orElse(Integer.MIN_VALUE);
        int secondLargest = -1;

        for (int num : A) {
            if(num <max && num> secondLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

}

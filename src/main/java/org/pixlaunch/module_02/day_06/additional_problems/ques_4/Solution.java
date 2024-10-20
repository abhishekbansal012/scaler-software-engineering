package org.pixlaunch.module_02.day_06.additional_problems.ques_4;

import java.util.*;

public class Solution {

    public int solve(ArrayList<Integer> A) {

        if (A.isEmpty()) return 0;

        // Find the maximum value in the array
        int max = A.stream().max(Comparator.naturalOrder()).orElse(Integer.MIN_VALUE);

        // Count the number of elements that are less than the maximum
        int count = 0;
        for (int num : A) {
            if (num < max) {
                count++;
            }
        }

        return count;
    }

}

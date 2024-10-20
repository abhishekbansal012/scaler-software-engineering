package org.pixlaunch.module_02.day_06.additional_problems.ques_2;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public int solve(ArrayList<Integer> A) {

        int max = Collections.max(A);

        int countSeconds = 0;

        for(Integer value: A) {
            countSeconds = countSeconds + (max-value);
        }
        return countSeconds;
    }

}

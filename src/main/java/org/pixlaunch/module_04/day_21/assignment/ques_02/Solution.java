package org.pixlaunch.module_04.day_21.assignment.ques_02;

import java.util.List;

public class Solution {

    public int singleNumber(final List<Integer> A) {

        int result = 0;

        for (int num : A) {
            result ^= num;
        }

        return result;
    }

}

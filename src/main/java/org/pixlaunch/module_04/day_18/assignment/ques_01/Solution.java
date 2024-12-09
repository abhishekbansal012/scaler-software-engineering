package org.pixlaunch.module_04.day_18.assignment.ques_01;

import java.util.List;

public class Solution {

    public int maxSubArray(final List<Integer> A) {
        int sum =0, ans = Integer.MIN_VALUE;
        for (Integer integer : A) {
            sum = sum + integer;
            ans = Math.max(sum, ans);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}

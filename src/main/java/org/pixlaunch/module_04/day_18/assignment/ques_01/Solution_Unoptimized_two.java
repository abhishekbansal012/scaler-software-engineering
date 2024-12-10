package org.pixlaunch.module_04.day_18.assignment.ques_01;

import java.util.List;

public class Solution_Unoptimized_two {
    public int maxSubArray(final List<Integer> A) {

        int ans = Integer.MIN_VALUE;

        for(int i=0;i < A.size(); i++) {
            int sum = 0;
            for (int j = i; j < A.size(); j++) {
                sum+= A.get(j);
                ans = Math.max(sum, ans);
            }
        }

        return ans;

    }
}

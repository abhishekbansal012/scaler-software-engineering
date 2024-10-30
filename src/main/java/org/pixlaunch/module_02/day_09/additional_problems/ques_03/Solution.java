package org.pixlaunch.module_02.day_09.additional_problems.ques_03;

import java.util.ArrayList;

public class Solution {

    public int solve(ArrayList<Integer> A, int B) {

        return getCountSubArrays(A, B);
    }

    private int getCountSubArrays(ArrayList<Integer> arr, int sumOfSubArray) {
        int n = arr.size();
        int count = 0;

        // Iterate over all possible starting points
        for (int start = 0; start < n; start++) {
            int currentSum = 0;

            // Iterate over all possible ending points
            for (int end = start; end < n; end++) {
                currentSum += arr.get(end); // Sum elements from start to end

                if(currentSum<sumOfSubArray) {
                    count++;
                }
            }
        }

        return count;
    }
}

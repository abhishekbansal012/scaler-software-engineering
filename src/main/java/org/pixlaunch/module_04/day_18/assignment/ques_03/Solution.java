package org.pixlaunch.module_04.day_18.assignment.ques_03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int trap(final List<Integer> heights) {
        int ans = 0;

        int n = heights.size();
        if (n < 3) {
            return 0; // Not enough bars to trap water
        }

        ArrayList<Integer> leftMax = new ArrayList<>(Collections.nCopies(n, 0));
        ArrayList<Integer> rightMax = new ArrayList<>(Collections.nCopies(n, 0));

        // Fill leftMax
        leftMax.set(0, heights.get(0));
        for (int i = 1; i < n; i++) {
            leftMax.set(i, Math.max(leftMax.get(i - 1), heights.get(i)));
        }

        // Fill rightMax
        rightMax.set(n - 1, heights.get(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            rightMax.set(i, Math.max(rightMax.get(i + 1), heights.get(i)));
        }

        // Calculate trapped water
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int waterAtBar = Math.min(leftMax.get(i), rightMax.get(i)) - heights.get(i);
            if (waterAtBar > 0) {
                totalWater += waterAtBar;
            }
        }

        return totalWater;

    }

}

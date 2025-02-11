package org.pixlaunch.module_05.day_33.assignment.ques_04;

import java.util.ArrayList;

public class Solution {

    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        if (n == 1) return A.get(0); // Only one element, return it

        // Check the first and last elements
        if (A.get(0) >= A.get(1)) return A.get(0);
        if (A.get(n - 1) >= A.get(n - 2)) return A.get(n - 1);

        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (A.get(i) >= A.get(i - 1) && A.get(i) >= A.get(i + 1)) {
                return A.get(i);
            }
        }

        return -1; // Should never reach here for a valid input
    }
}

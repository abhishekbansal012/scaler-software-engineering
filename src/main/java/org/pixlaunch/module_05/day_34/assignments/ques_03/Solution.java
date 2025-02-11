package org.pixlaunch.module_05.day_34.assignments.ques_03;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return solve(B, A); // Ensure A is the smaller array
        }

        int x = A.size();
        int y = B.size();
        int NOE_leftHalf = (x + y + 1) / 2;
        int s = 0, e = x;

        while (s <= e) {
            int m = (s + e) / 2;
            int NOE_Array1 = m;
            int NOE_Array2 = NOE_leftHalf - NOE_Array1;

            int xL = (NOE_Array1 == 0 ? Integer.MIN_VALUE : A.get(NOE_Array1 - 1));
            int xR = (NOE_Array1 == x ? Integer.MAX_VALUE : A.get(NOE_Array1));

            int yL = (NOE_Array2 == 0 ? Integer.MIN_VALUE : B.get(NOE_Array2 - 1));
            int yR = (NOE_Array2 == y ? Integer.MAX_VALUE : B.get(NOE_Array2));

            if (xL <= yR && yL <= xR) {
                if ((x + y) % 2 == 0) {
                    return (Math.max(xL, yL) + Math.min(xR, yR)) / 2;
                } else {
                    return Math.max(xL, yL);
                }
            } else if (xL > yR) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }
}

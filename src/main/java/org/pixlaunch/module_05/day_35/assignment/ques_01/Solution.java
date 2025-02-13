package org.pixlaunch.module_05.day_35.assignment.ques_01;

import java.util.ArrayList;

public class Solution {
    /*
    * A - There are A painters available
    * B - each painter takes B units of time to paint 1 unit of the board.
    * C - C[i] represents the length of ith board
    * */
    public int paint(int A, int B, ArrayList<Integer> C) {
        int MOD = 10000003;
        long max = 0, sum = 0;

        for (int length : C) {
            max = Math.max(max, length);
            sum += length;
        }

        long s = max * B;  // Minimum possible time
        long e = sum * B;  // Maximum possible time
        long ans = e;

        while (s <= e) {
            long mid = s + (e - s) / 2;  // Prevent overflow
            if (paintPossible(C, mid, B, A)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return (int) (ans % MOD);
    }

    private boolean paintPossible(ArrayList<Integer> C, long x, int t, int p) {
        int painters = 1;
        long timeTaken = 0;

        for (int length : C) {
            long timeCurrentBoard = (long) length * t;  // Prevent overflow

            if (timeTaken + timeCurrentBoard > x) {
                painters++;
                timeTaken = timeCurrentBoard;
                if (painters > p) {
                    return false;
                }
            } else {
                timeTaken += timeCurrentBoard;
            }
        }
        return true;
    }
}

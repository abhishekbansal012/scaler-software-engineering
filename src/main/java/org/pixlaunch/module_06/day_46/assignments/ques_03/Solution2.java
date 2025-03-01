package org.pixlaunch.module_06.day_46.assignments.ques_03;

import java.util.ArrayList;

public class Solution2 {
    private static final int MOD = 1000000007;

    public int solve(ArrayList<Integer> A, int B) {
        int left = 0, right = A.size() - 1;
        long count = 0;

        while (left < right) {
            int sum = A.get(left) + A.get(right);

            if (sum == B) {
                if (A.get(left).equals(A.get(right))) {
                    int n = right - left + 1;
                    count = (count + (long) n * (n - 1) / 2) % MOD;
                    break;
                }

                int leftCount = 1, rightCount = 1;

                while (left + 1 < right && A.get(left).equals(A.get(left + 1))) {
                    left++;
                    leftCount++;
                }
                while (right - 1 > left && A.get(right).equals(A.get(right - 1))) {
                    right--;
                    rightCount++;
                }

                count = (count + (long) leftCount * rightCount) % MOD;
                left++;
                right--;
            } else if (sum < B) {
                left++;
            } else {
                right--;
            }
        }

        return (int) count;
    }
}

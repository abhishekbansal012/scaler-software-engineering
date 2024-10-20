package org.pixlaunch.module_02.day_04.assignment.ques_01;

public class Solution {

    public int solve(int A) {
        return findFactorCount(A);
    }

    private int findFactorCount(int a) {
        int count = 0;
        for(int i=1; i<Math.sqrt(a); i++) {
            if (a % i==0) {
                if(i == a/i) {
                    count++;
                } else {
                    count = count+2;
                }

            }
        }
        return count;
    }

}

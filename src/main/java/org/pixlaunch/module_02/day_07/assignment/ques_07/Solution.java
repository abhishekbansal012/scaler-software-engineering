package org.pixlaunch.module_02.day_07.assignment.ques_07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        return createPrefixSum(A);
    }

    private ArrayList<Integer> createPrefixSum(ArrayList<Integer> A) {

        //Formula for prefixSum preSum[i] = preSum[i-1] + A[i]
        for(int i=0; i<A.size(); i++) {
            if(i!=0) {
                A.set(i, A.get(i-1) + A.get(i));
            }
        }
        return A;
    }
}

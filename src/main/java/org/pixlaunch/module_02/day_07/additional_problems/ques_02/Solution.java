package org.pixlaunch.module_02.day_07.additional_problems.ques_02;

import java.util.ArrayList;

public class Solution {

    /**
     * The equilibrium index of an array is an index such that the
     * sum of elements at lower indexes is equal to the sum of elements at higher indexes.
     */
    //input array sample -7,1,5,2,-4,3,0
    public int solve(ArrayList<Integer> A) {
        Integer cursor = solutionBruteForce(A);
        //Integer cursor = solutionOptimized_one(A);

        if (cursor != null) {
            return cursor;
        }

        return -1;

    }

    private Integer solutionOptimized_one(ArrayList<Integer> arr) {
        //Calculate PrefixSum for array arr
        int cursor =0;

        ArrayList<Integer> prefixSum = new ArrayList<>();

        for(int i=0;i<arr.size();i++) {
            
        }
        int leftSum = 0;
        int rightSum = 0;

        if(leftSum == rightSum) {
            return cursor;
        }

        cursor++;
        return null;
    }

    private Integer solutionBruteForce(ArrayList<Integer> A) {
        //Brute Force Approach
        int cursor =0;
        while(cursor < A.size()) {

            int leftSum = 0;
            int rightSum = 0;

            for(int i=0;i<cursor; i++) {
                leftSum+= A.get(i);
            }

            for(int i = cursor+1; i< A.size(); i++) {
                rightSum+= A.get(i);
            }

            if(leftSum == rightSum) {
                return cursor;
            }

            cursor++;

        }
        return null;
    }
}

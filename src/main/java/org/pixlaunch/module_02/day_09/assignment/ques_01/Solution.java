package org.pixlaunch.module_02.day_09.assignment.ques_01;

import java.util.ArrayList;

public class Solution {

    public int maxSubarray(int A, int B, ArrayList<Integer> C) {
        return calculateMaxSumArray(B,C);
    }

    private int calculateMaxSumArray(int maxSum, ArrayList<Integer> arr) {

        int maxSumCapped=0;
        for (int i=0; i<arr.size();i++) {
            for(int j=i; j<arr.size(); j++) {
                int sum=0;
                for(int start=i; start<=j; start++) {
                    sum+=arr.get(start);
                }

                if(sum<=maxSum && sum>=maxSumCapped) {
                    maxSumCapped = sum;
                }

            }
        }

        return maxSumCapped;
    }


}

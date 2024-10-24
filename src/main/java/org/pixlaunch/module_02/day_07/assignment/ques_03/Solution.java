package org.pixlaunch.module_02.day_07.assignment.ques_03;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> prefixSum = calculatePreFixSum(A);
        return calculateGivenRangeSum(prefixSum,A, B);
    }

    private ArrayList<Long> calculateGivenRangeSum(ArrayList<Integer> prefixSum,ArrayList<Integer> A,
                                                   ArrayList<ArrayList<Integer>> B ) {


        //int N = A.size();
        int M = B.size();

        // Step 2: Process each query
        ArrayList<Long> results = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            int L = B.get(i).get(0);
            int R = B.get(i).get(1);

            if(L<0) {
                results.add(i, prefixSum.get(R).longValue()); // sum from index L to R
            } else {
                results.add(i, prefixSum.get(R).longValue() - prefixSum.get(L - 1).longValue()); // sum from index L to R
            }
        }

        return results;


    }


    private ArrayList<Integer> calculatePreFixSum(ArrayList<Integer> A) {

        ArrayList<Integer> newA = new ArrayList<>();
        int arrayIndex = 0;
        //Formula for prefixSum preSum[i] = preSum[i-1] + A[i]
        for(int i=0; i<A.size(); i++) {

            if(i==0) {
                newA.add(arrayIndex,  A.get(i));
                arrayIndex++;
            } else{
                int element = newA.get(i - 1) + A.get(i);
                newA.add(arrayIndex, element);
                arrayIndex++;
            }
        }
        return newA;
    }

}

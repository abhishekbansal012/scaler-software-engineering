package org.pixlaunch.module_02.day_09.assignment.ques_02;

import java.util.ArrayList;
import java.util.Optional;

public class Solution {

    public Long subarraySum(ArrayList<Integer> A) {

        //Approach of O(n^2) giving TLE as per constraints
        /*ArrayList<Integer> prefixSum = calculatePrefixSum(A);
        return calculateSumOfArray(A, prefixSum);*/

        //Approach of O(N)
        return calculateSumOfArraySolution2(A);

    }

    private Long calculateSumOfArraySolution2(ArrayList<Integer> arr) {

        long sum=0;
        for(int i=0;i<arr.size(); i++) {
            sum = sum+((long) arr.get(i) *(i+1)*(arr.size()-i));
        }

        return sum;
    }

    private static long calculateSumOfArray(ArrayList<Integer> A, ArrayList<Integer> prefixSum) {
        long sum=0;

        for (int i = 0; i< A.size(); i++) {
            for(int j = i; j< A.size(); j++) {
                if(i==0) {
                    sum = sum +(prefixSum.get(j));
                }else {
                    sum = sum +(prefixSum.get(j)- prefixSum.get(i-1));
                }
            }
        }
        return sum;
    }

    private ArrayList<Integer> calculatePrefixSum(ArrayList<Integer> A) {

        int sum = 0;
        for(int i=0; i<A.size(); i++ ){
            sum=sum+A.get(i);
            A.set(i, sum);
        }
        return A;
    }
}

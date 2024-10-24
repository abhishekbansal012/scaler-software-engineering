package org.pixlaunch.module_02.day_07.assignment.ques_04;

import java.util.ArrayList;

public class Solution {
    public int solve(ArrayList<Integer> A) {

        int count = 0;
        for(int i =0;i<A.size();i++) {
            if(i == 0) {
                //Sum of Even index elements after removing ith element
                int sumOfEvenElements = sumOfArrayForRangeOfOddIndexes(A, i+1, A.size()-1);

                //Sum of Odd index elements after removing ith element
                int sumOfOddElements = sumOfArrayForRangeOfEvenIndexes(A, i+1, A.size()-1);

                if(sumOfEvenElements == sumOfOddElements) {
                    count++;
                }
            } else {
                //Sum of Even index elements after removing ith element
                int sumOfEvenElements = sumOfArrayForRangeOfEvenIndexes(A, 0, i-1)
                        + sumOfArrayForRangeOfOddIndexes(A, i+1, A.size()-1);

                //Sum of Odd index elements after removing ith element
                int sumOfOddElements = sumOfArrayForRangeOfOddIndexes(A, 0, i-1)
                        + sumOfArrayForRangeOfEvenIndexes(A, i+1, A.size()-1);

                if(sumOfEvenElements == sumOfOddElements) {
                    count++;
                }
            }
        }
        return count;
    }

    private int sumOfArrayForRangeOfOddIndexes(ArrayList<Integer> A, int leftIndex, int rightIndex) {
        int sum = 0;

        for(int i = leftIndex; i<=rightIndex; i++) {
            if(i%2!=0) {
                sum+=A.get(i);
            }
        }

        return sum;

    }

    private int sumOfArrayForRangeOfEvenIndexes(ArrayList<Integer> A, int leftIndex, int rightIndex) {

        int sum = 0;

        for(int i = leftIndex; i<=rightIndex; i++) {
            if(i%2==0) {
                sum+=A.get(i);
            }
        }

        return sum;
    }

}

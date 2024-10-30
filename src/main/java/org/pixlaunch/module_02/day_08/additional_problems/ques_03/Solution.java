package org.pixlaunch.module_02.day_08.additional_problems.ques_03;

import java.util.*;

public class Solution {
    //Input value - 1,4,5,2,4
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {

        //return solutionBruteForce(A);

        return solutionOptimised(A);


    }

    private static int solutionOptimised(List<Integer> A) {
        int maxProfit = 0;
        int max = A.get(A.size()-1);

        for(int i = A.size()-1; i>=0; i--) {
            if(A.get(i) > max) {
                max= A.get(i);
            }
            int profit = max - A.get(i);
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    private static int solutionBruteForce(List<Integer> A) {
        int maxProfit = Integer.MIN_VALUE;
        if(Objects.isNull(A) || A.isEmpty()) {
            return 0;
        }
        for(int i = 0; i< A.size(); i++) {
            for(int j = i; j< A.size(); j++) {
                if(Math.subtractExact(A.get(j), A.get(i)) > maxProfit) {
                    maxProfit = Math.subtractExact(A.get(j), A.get(i));
                }
            }
        }

        return maxProfit;
    }


}

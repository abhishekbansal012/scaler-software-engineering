package org.pixlaunch.module_04.day_18.assignment.ques_01;

import java.util.ArrayList;
import java.util.List;


//Not optimized solution
public class Solution_Unoptimized_one {

    public int maxSubArray(final List<Integer> A) {

        ArrayList<Integer> prefixSum = calculatePrefixSum((ArrayList<Integer>) A);
        int ans = Integer.MIN_VALUE;
        for(int i=0;i < A.size(); i++) {
            for(int j=0; j<A.size();j++) {
                int sum = 0;
                if (sum == 0) {
                    sum = prefixSum.get(j);
                } else {
                    sum = prefixSum.get(j) - prefixSum.get(i-1);
                }
                ans = Math.max(ans, sum);
            }
        }

        return ans;
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

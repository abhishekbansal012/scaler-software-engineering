package org.pixlaunch.module_04.day_22.assignment.ques_01;

import java.util.List;

public class Solution {

    public int singleNumber(final List<Integer> A) {
        return uniqueNumber(A);
    }


    int uniqueNumber(List<Integer> A) {

        int ans=0;
        for (int i =0;i<32;i++) {
            int count =0;
            for(int j=0;j<A.size(); j++) {
                int temp = A.get(j) & (1 << i);
                if( temp > 0) {
                    count++;
                }
            }

            if((count % 3) >0) {
                ans = ans | (1<<i);
            }
        }
        return ans;

    }


}

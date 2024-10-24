package org.pixlaunch.module_02.day_08.assignment.ques_06;

import java.util.ArrayList;

public class Solution {

    public Long solve(String A) {

        return countSpecialSubStrings(A);
    }

    private Long countSpecialSubStrings(String A) {

        int countOfA = 0;
        long ans= 0;
        char[] Achar = A.toCharArray();

        for(int i=0;i<Achar.length;i++) {
            if(Achar[i] =='a') {
                countOfA++;
            }
            if(Achar[i] =='g') {
                ans = ans+ countOfA;
            }
        }
        return ans;
    }


}
